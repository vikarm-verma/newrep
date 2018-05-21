import java.util.*;

class Bank_Transaction_Model
{
private static float amount_withdraw,amount_deposit,balance_amount;
//static int checking_transaction;
int flagD=0,flagW=0;

public void withdraw_amount(float amount_withdraw)
{
flagW++;

if(flagW==1)
{

this.amount_withdraw=amount_withdraw-amount_withdraw *0.0040f;
balance_amount=balance_amount-this.amount_withdraw;
//checking_transaction=0;
}
else
{

this.amount_withdraw=amount_withdraw-amount_withdraw *0.0050f;
balance_amount=balance_amount-this.amount_withdraw;

}
flagD=0;
//checking_transaction=0;
}

public void deposit_amount(float amount_deposit)
{
flagD++;
if(flagD==1)
{

this.amount_deposit=amount_deposit-amount_deposit*0.0020f;
balance_amount=balance_amount+this.amount_deposit;

}
else
{

this.amount_deposit=amount_deposit-amount_deposit*0.0025f;
balance_amount=balance_amount+this.amount_deposit;


}
flagW=0;
}

public float get_balance()
{
//balance_amount=amount_deposit;
return balance_amount;
}
}



class Customer_Banking
{
private float amount_withdraw,amount_deposit,balance_amount;
void menu()
{

boolean a = true;


while(a)
{
System.out.println("Welcome to Canara Bank Kindly Enter your Choice");
System.out.println("");
System.out.println("A. Withdraw amount");
System.out.println("B. Deposit amount");
System.out.println("C. Getting Balance");

Bank_Transaction_Model btm = new Bank_Transaction_Model();
Scanner s = new Scanner(System.in);
String choice = s.nextLine();

switch(choice)
{

case "A":
System.out.println("enter amount to withdraw");
float w_amount=s.nextFloat();
btm.withdraw_amount(w_amount);

break;

case "B":
System.out.println("enter amount to deposit");
float d_amount=s.nextFloat();
btm.deposit_amount(d_amount);

break;

case "C":
System.out.println(btm.get_balance());
break;

default:
System.out.println("Kindly choose correctly");

}
}
}
public static void main(String [] args)
{
Customer_Banking cb = new Customer_Banking();
cb.menu();
}
}



//73.438
//196.7645