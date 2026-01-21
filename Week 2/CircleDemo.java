public class CircleDemo{
    public static void main(String args[]){

        Circle c1 = new Circle();
        System.out.println(c1);
        Circle c2 = new Circle(6.5);
        System.out.println(c2.toString());
       
        Circle c3 = new Circle(5.0,"pink");
        System.out.println(c3);
        Circle c4 = new Circle(c1);
        System.out.println(c4);

        // System.out.println(c1.getRadius());
        // c1.setRadius(7.0);
        // c1.setColor("yellow");
        //  System.out.println(c1);
        //   System.out.println(c1.getArea());
    }
}