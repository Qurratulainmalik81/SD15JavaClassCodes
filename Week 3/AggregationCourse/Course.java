public class Course{
    private String courseName;
    private Instructor instructor;
    private TextBook textBook;

    public Course(String  name, Instructor instructor, TextBook textbook)
    {
        this.courseName = name;
        this.instructor = instructor;
        this.textBook = textbook;
    }

    public String getCourseName()
    {
        return this.courseName;
    }
    public Instructor getInstructor()
    {
        return this.instructor;
    }
    public TextBook getTextBook()
    {
        return this.textBook;
    }
    public String toString()
    {
        return(this.courseName + " is taught by " + this.instructor + " and Textbook is" + this.textBook);
    }

}