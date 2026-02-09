public class Person {
    private String fname;
    private String lname;

    Person(String fn, String ln)
    {
        this.fname = fn;
        this.lname = ln;
    }
    public String toString()
    {
        return (this.fname + " " + this.lname);
    }
}
