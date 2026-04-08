import java.util.ArrayList;
import java.util.List;

public class DemoGeneric {
    public static void main(String[] args)
    {
        GenericSample<Double> DGS = new GenericSample<Double>(5.5);
        System.out.println(DGS);

        GenericSample<String> SGS = new GenericSample<String>("Hello");
        System.out.println(SGS);

        Example<String, Integer> SI = new Example<String,Integer>("Hello", 10);
        System.out.println(SI);

        Example<Double, Integer> DI = new Example<Double,Integer>(5.6, 10);
        System.out.println(DI);
        DI.display("Double & Integer");
        

        Circle c1 = new Circle();
        c1.display(5.0);
        c1.display(10);
        c1.display("hello");

        List<Integer> list = new ArrayList<>();
        list.add(100); // Autoboxing: int 100 is converted to Integer object

        Integer ObjectInt = 100;
        int n = ObjectInt; //Unboxing



    }
}
