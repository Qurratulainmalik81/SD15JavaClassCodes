public class Demo {
    public static void main(String[] args)
    {
        OuterClass OC = new OuterClass();
        System.out.println(OC);

        OuterClass.innerClass ICOB = OC.new innerClass();
         System.out.println(ICOB);

         OuterClass.StaticInnerClass SIC = new OuterClass.StaticInnerClass();
         SIC.displayStaticInnerClass();
    }
}
