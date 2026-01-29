public class TestCourse {
   public  static void main(String[] args)
   {
    Instructor JavaInst = new Instructor("Malik", "Qurratulain", "G102");
    TextBook javaBook = new TextBook("How to program Early object", "Deitel", "Pearson");
    Course Java = new Course ("Advanced java" , JavaInst, javaBook);
    System.out.println(Java);

   }
}
