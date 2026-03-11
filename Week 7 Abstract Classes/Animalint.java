public interface Animalint {
    double g = 10.0;
    //constants
    //cannot have instant variables
    //cannot have constructors
    //can have abstract methods
    //interface methods are by default public & abstract
    //interface attributed are by default public, final & Static
    void eat();
    public abstract void sleep();
    public abstract void move();
    
    default void display()
    {
        System.out.println("this is my interface's defualt method");
    }
}
