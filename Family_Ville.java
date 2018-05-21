class Family_Ville
{
String name;
String gender;
String color;
String address;
String parents;
String lastName;

public Family_Ville()
{
 name="";
 gender ="";
 color ="";
 address ="";
 parents="";   
lastName="";
}

void Show_Details()
{
System.out.println("name is "+name);
System.out.println("gender is "+gender);
System.out.println("color is "+color);
System.out.println("address is "+address);
System.out.println("parents are "+parents);
System.out.println("last name is "+lastName);
}

Family_Ville createChild(Family_Ville fv1 , Family_Ville fv2)
{
Family_Ville fv3 = new Family_Ville();
fv3.name="gudiya";
fv3.gender="female";
if(fv1.color.equals(fv2.color))
{
if(fv3.color.equals("male"))
{
fv3.color="blue";
}
else
{
fv3.color="black";
}
}

if(!fv1.color.equals(fv2.color))
{
if(fv3.color.equals("male"))
{
fv3.color=fv2.color;
}
else
{
fv3.color=fv1.color;
}
}
fv3.lastName=fv1.lastName;
fv3.address =fv3.address;

return fv3;
}

public static void main(String [] args)
{
Family_Ville fv1 = new Family_Ville();
fv1.name ="Rahul";
fv1.gender ="male";
fv1.color="black";
fv1.address ="delhi";
fv1.parents ="Rahul's Parents";

Family_Ville fv2 = new Family_Ville();
fv2.name ="Sunita";
fv2.gender ="female";
fv2.color="blue";
fv2.address ="delhi";
fv2.parents ="sunita's Parents";

Family_Ville fv3 = fv1.createChild(fv1,fv2);
fv3.Show_Details();
}

}