public class Planet
{	
    //Attributes
    //Instance variables
	public double radius;
	public String name;

    //Static or class Variable
	public static final long g = 10;
    public static int count = 0;

    //Constructor
	public Planet()
    {
    this.radius = 0.0;
    this.name = null;
    count++;
    }

    //Methods
	public void display()
	{
		System.out.println("Radius "+ radius);
		System.out.println("Name " + name);
		System.out.println("Long "+ g);	
        System.out.println("Panets count = " + count);
    }
	public void initialize()
    {
		this.radius = 10;	//usage
		this.name = "Earth";	//usage	
	}
    //Main Method
	public static void main(String [] args)		
	{
		Planet p = new Planet(); // creation
		Planet p1 = new Planet();
        Planet p2 = new Planet();
        Planet p3 = new Planet();

        System.out.println("Planet P");
		p.initialize();		//usage
		p.display();		//usage
		
        System.out.println("\nPlanet P1");
        p1.radius = 20;
        p1.name = "Mars";
        p1.display();

          
        System.out.println("\nPlanet P2");

        p2.display();
	}
}
