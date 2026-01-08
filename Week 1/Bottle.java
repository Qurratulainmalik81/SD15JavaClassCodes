public class Bottle{
    //state
    //attributes and fields using variables
    String color;
    int size;
    int capacity;
    boolean filled = true;
    //behaviors
    public void isFull()
    {
        if(this.filled ==true)
        System.out.print("the bottle is full");
    }

    public static void main(String args[])
    {
        Bottle b1 = new Bottle();
        Bottle b2 = new Bottle();

        b1.color = "Green";
        b2.color = "blue";
        

    }
}