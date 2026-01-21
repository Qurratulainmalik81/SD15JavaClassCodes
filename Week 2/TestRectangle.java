public class TestRectangle {
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle(4.0f,2.0f);
        Rectangle r2 = new Rectangle(8.0f,4.0f);

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("Rectangle 1 Area = " + r1.getArea());
        System.out.println("Rectangle 1 Perimeter = " + r1.getPerimeter());

        System.out.println("Rectangle 2 Area = " + r2.getArea());
        System.out.println("Rectangle 2 Perimeter = " + r2.getPerimeter());


    }
}
