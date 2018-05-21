
class 2DGeometry
{
private float length,width,height,surface_area;

void set_length(float length)
{
this.length=length;
}
float get_length()
{
return this.length;
}

void set_width(float width)
{
this.width=width;
}
float get_width()
{
return this.width;
}

void set_height(float height)
{
this.height=height;
}
float get_height()
{
return height;
}
public void calculate_Area(float length)
{
surface_area = length*length;
System.out.println("area of square is "+ surface_area);
}
public void calculate_Area(float legth , float width , float height)
{
surfacearea = 2*(length*width+length*height+width*height);
System.out.println("Area of rectangle is "+surfacearea);
}
}

class 3DGeometry 
{
private float side , surfacearea;

public void surfaceArea()
{
surfacearea = side*side;
System.out.println("Area of cube is "+surfacearea);
}
public void surfaceArea(float lenght , float breadth , float height)
{
surfacearea = 2*((length+breadth)+(breadth+height)+(height+length));
}
}



