public class Rectangle {
    //Instant variables
    private float length = 1.0f;
    private float width = 1.0f;

    //Constrctors
    public Rectangle()
    {
        this.length = 1.0f;
        this.width = 1.0f;
    }
    public Rectangle(float length, float width)
    {
        this.length = length;
        this.width = width;
    }
    public float getLength()
    {
        return this.length;
    }
    public void setLength(float length)
    {
        this.length = length;
    }
    public float getWidth()
    {
    return this.width;
    }
    public void setWidth(float width)
    {
        this.width = width;
    }
    public double getArea()
    {
        return (this.length * this.width);
    }
    public double getPerimeter()
    {
        return (2 * (this.length + this.width));
    }
    public String toString()
    {
        return ("length = " + this.length + " and width = " + this.width);
    }
    
}
