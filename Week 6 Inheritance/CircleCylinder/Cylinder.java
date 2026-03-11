public class Cylinder extends Circle{
    private double height = 1.0;
    private static int count = 0;
public Cylinder()
{
    super();
   
}
public Cylinder(double height)
{
    super();
    this.height = height;
}
public Cylinder(double height, double radius)
{
    super(radius);
    this.height = height;

}
public Cylinder(double height, double radius, String color)
{
    super(radius,color);
    this.height = height;
}
public double getHeight()
{
    return this.height;
}
public void setHeight(double height)
{
    this.height = height;
}
public String toString()
{
    return (super.toString() + " and height = " + this.height);
}
public double getVolume()
{
    //PI * radius * radius * height
  //  return(Math.PI * super.getRadius() * super.getRadius() * this.height);
    return (super.getArea()*this.height);
}


    
}
