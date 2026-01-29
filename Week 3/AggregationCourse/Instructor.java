public class Instructor {
    private String lastName;
    private String firstName;
    private String officeNumber;

    public Instructor(String lname, String fname, String office)
    {
        this.firstName = fname;
        this.lastName = lname;
        this.officeNumber = office;
    }
    public Instructor(Instructor object2)
    {
        this.firstName = object2.firstName;
        this.lastName = object2.lastName ;
        this.officeNumber = object2.officeNumber;
    }
    public void set(String lname, String fname, String office)
    {
        this.firstName = fname;
        this.lastName = lname;
        this.officeNumber = office;
    }
    public String toString()
    {
        return (this.firstName + " " + this.lastName + " Office Number = " + this.officeNumber);
    }

}
