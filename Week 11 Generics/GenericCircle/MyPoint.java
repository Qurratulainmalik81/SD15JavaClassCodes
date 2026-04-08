public class MyPoint<T extends Number>{
    private T x;
    private T y;

    public MyPoint()
    {
        this.x = null;
        this.y = null;
    }
    
    public MyPoint(T x, T y)
    {
        this.x = x;
        this.y = y;
    }
    public T getX()
    {
        return this.x;
    }
    public void setX(T x)
    {
        this.x = x;
    }
    public T getY()
    {
        return this.y;
    }
    public void setY(T x)
    {
        this.y = y;
    }
    public void setXY(T x, T y)
    {
        this.x = x;
        this.y = y;
    }
    public String toString()
    {
        return ("("+this.x +","+this.y+")");
    }
    public double distance(T x, T y)
    {
    double xDiff = this.x.doubleValue() - x.doubleValue();
    double yDiff = this.y.doubleValue() - y.doubleValue();
    return Math.sqrt(xDiff*xDiff + yDiff*yDiff);

    }
    public double distance(MyPoint p)
    {
    double xDiff = this.x.doubleValue()- p.x.doubleValue();
    double yDiff = this.y.doubleValue()- p.y.doubleValue();
    return Math.sqrt(xDiff*xDiff + yDiff*yDiff);

    }
    public double distance()
    {
    double xDiff = this.x.doubleValue();
    double yDiff = this.y.doubleValue()- 0;
    return Math.sqrt(xDiff*xDiff + yDiff*yDiff);

    }
}
