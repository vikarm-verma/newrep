

class TwoD_Geometry
{
private float length,width,height,surfacearea;


public float calculateArea(float length)
{
this.length = length;
surfacearea=this.length*this.length;
return surfacearea;
}
 
public float calculateArea(float length , float width )
{
this.length = length;
this.width = width;
surfacearea = 2*(this.length*this.width);
return surfacearea;
}
}

class ThreeD_Geometry 
{
private float side , surfacearea,length,breadth,height;

public float calculateArea(float side)
{
this.side = side;
surfacearea = this.side*this.side;
return surfacearea;
}
public float calculateArea(float length , float breadth , float height)
{
this.length = length;
this.breadth = breadth;
this.height = height;
surfacearea = 2*((this.length+this.breadth)+(this.breadth+this.height)+(this.height+this.length));
return surfacearea;
}
}


class Calculate_Area 
{
public static void main(String [] args)
{
Calculate_Area ca = new Calculate_Area();
TwoD_Geometry tg = new TwoD_Geometry();
ThreeD_Geometry tg3 = new ThreeD_Geometry();
System.out.println("Calculating area of square "+tg.calculateArea(10));
System.out.println("Calculating area of rectangle "+tg.calculateArea(10,8));
System.out.println("Calculating area of cube "+tg3.calculateArea(10));
System.out.println("Calculating area of cuboid "+tg3.calculateArea(10,8,7));
}
}




