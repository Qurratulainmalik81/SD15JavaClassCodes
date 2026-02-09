import java.util.ArrayList;

public class ArrayListPrac {
    public static void main(String[] args)
    {
          ArrayList<Person> PersonList = new ArrayList<>();
          PersonList.add(new Person("Matt","Reid"));
          Person p1 = new Person("Merethe","Batino");
          PersonList.add(p1);
          System.out.println(PersonList);

          for(int i = 0; i<PersonList.size();i++)
            System.out.println(PersonList.get(i));
        // ArrayList<String> name = new ArrayList<String>();
        // name.add("Justin");
        // name.add("Merethe");
        // System.out.println(name);
        // System.out.println(name.size());
        // name.add("Ainee");
        //  System.out.println(name);
        // System.out.println(name.size());
        // name.add(0,"Chris");
        //  System.out.println(name);
        //  name.remove(3);
        //  name.remove("Chris");
        //   System.out.println(name);
        //   name.set(0,"Ainee");
        //    System.out.println(name);

    }
}
