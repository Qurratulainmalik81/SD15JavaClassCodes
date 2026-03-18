import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class FileDemo{
    public static void main(String[] arg)
    {
        // Employee E1 = new Employee(1, "One", "Employe", 5000);
        // Employee E2 = new Employee(E1);
        // Employee E3 = new Employee(2, "Two", "Emp", 4000);
        // Employee E4 = new Employee(E2);
        // Employee E5 = new Employee(E2);

        // try{
        //     FileOutputStream fileo = new FileOutputStream("Emp.txt");
        //     ObjectOutputStream out = new ObjectOutputStream(fileo);
        //     out.writeObject(E1);
        //     out.writeObject(E2);
        //     out.writeObject(E3);
        //     out.writeObject(E4);
        //     out.writeObject(E5);
        //     out.close();
        //     fileo.close();
        // }
        // catch(Exception e)
        //     {
        //         e.printStackTrace();
        //     }
        //Read objects from a file

        ArrayList<Employee> Emp = new ArrayList<Employee>();
                 try{
                FileInputStream Fin = new FileInputStream("Emp.txt");
                ObjectInputStream in = new ObjectInputStream(Fin);
                Object temp = null;
                while(true)
                {
                    try{
                    temp = in.readObject();
                    }
                    catch(EOFException e)
                    {
                        break;//end of file
                    }
                    Emp.add((Employee)temp);
                }
                Fin.close();
                in.close();
            }
             catch(Exception e)
            {
                e.printStackTrace();
            }

            System.out.println(Emp);
        // try{
        // File file = new File("javaFile.txt");
        // if(file.createNewFile())
        // {
        //     System.out.println("New File Created");
        // }
        // else
        // {
        //     {
        //     System.out.println("File already Exist");
        // }
        // }
        // }
        // catch(IOException e)
        // {
        //     e.printStackTrace();
        // }

        // try{
        //    FileWriter fw=new FileWriter("abc.txt");  
        //    fw.write("My name is Ainee");
        //    fw.close();
        // }
        //    catch(IOException e)
        // {
        //     e.printStackTrace();
        // }

        //  try{
        //     FileReader fr = new FileReader("abc.txt");
        //     int i;
        //     while((i=fr.read())!=-1)
        //     {
        //         System.out.print((char)i);
        //     }
        //     fr.close();
          
        // }
        //    catch(IOException e)
        // {
        //     e.printStackTrace();
        // }
        
    //     try{
    //         FileOutputStream fout = new FileOutputStream("xya.txt");
    //         String s = "Canada is my favourite Country";
    //         byte b[] = s.getBytes();
    //         fout.write(b);
    //         fout.close();
    //     }
    //   catch(Exception e)
    //    {
    //        e.printStackTrace();
    //    }


        //   try{
        //     FileInputStream fr = new FileInputStream("xya.txt");
        //     int i;
        //     while((i=fr.read())!=-1)
        //     {
        //         System.out.print((char)i);
        //     }
        //     fr.close();
          
        // }
        //    catch(IOException e)
        // {
        //     e.printStackTrace();
        // }
    }
}