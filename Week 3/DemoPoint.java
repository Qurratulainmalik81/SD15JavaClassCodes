public class DemoPoint {
    public static void main(String[] args)
    {
        MyPoint p1 = new MyPoint(4, 8);
        MyPoint p2 = new MyPoint(10, 15);
        System.out.println(p1);
        System.out.println(p1.distance(8, 20));
        System.out.println(p1.distance(p2));
        System.out.println(p1.distance());
        System.out.println(p2.distance());
    }
    
}
