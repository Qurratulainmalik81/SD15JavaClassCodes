//you cannot intantiate abstract class
//you need to extend your abstract class in order to use it
//abstract class can have instant variables
//Abstract class can have constructors
//abstract class may or may not have abstract methods
//abstract methods are the mthods that do not have implementation

public abstract class Animal implements Animalint, MarkerInterface, FunctionalInterface{
    private String name;

    public Animal(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return ("Name :" + this.name);
    }
    public abstract void greet();

    public void display()
    {}
}