public class GenericSample<T>
{
    private T x;

    public GenericSample()
    {
        this.x = null;
    }
      public GenericSample(T x)
    {
        this.x = x;
    }

    public void setX(T x)
    {
      this.x = x; 
    }
    public T getX()
    {
        return this.x;
    }
    public String toString()
    {
        return("Value = " + this.x);
    }


}