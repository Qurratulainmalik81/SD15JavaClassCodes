public class Example<E,U> {
    private E x;
    private U y;

    public Example(E x, U y)
    {
        this.x = x;
        this.y = y;
    }

    public void setX(E x)
    {
    this.x = x;
    }
    public void setY(U y)
    {
    this.y= y;
    }
    public E getX()
    {
        return this.x;
    }
       public U getY()
    {
        return this.y;
    }
    public String toString(){
        return ("Pair = " + this.x + "," + this.y);
    }
    
    public<Y> void display(Y z)
    {
    
        System.out.println(z);
        System.out.println(this.x);
        System.out.println(this.y);
    }
}
