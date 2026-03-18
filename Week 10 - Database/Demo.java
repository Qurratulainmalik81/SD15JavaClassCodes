import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args)
    {
       // WriteSingleRecord();
     //  WriteDB();
       ReadDB();
   
    }
public static void ReadDB()
{
    ArrayList<Employee> Emplist = new ArrayList<Employee>();
    String query = " SELECT * FROM employee";

    try{
          Connection con = DatabaseConnection.getcon();
         PreparedStatement statement = con.prepareStatement(query);
         ResultSet rs = statement.executeQuery();

         while(rs.next())
         {
            Employee temp = new Employee();
            temp.setId(rs.getInt("id"));
            temp.setFirstName(rs.getString("fname"));
            temp.setLastName(rs.getString("lname"));
            temp.setSalary(rs.getDouble("salary"));
            Emplist.add(temp);
         }
         con.close();

    }
    catch(SQLException e)
    {
        e.printStackTrace();
    }
System.out.println(Emplist);

}
    public static void WriteDB()
    {
        ArrayList<Employee> Emplist = new ArrayList<Employee>();
        Scanner in = new Scanner(System.in);
        int option = 0;

        while(option!=-1)
        {
            System.out.println("Enter Employee ID:");
            int id = in.nextInt();
            in.nextLine();
            System.out.println("Enter Empolye First Name:");
            String fn = in.nextLine();
            System.out.println("Enter Employee Last Name:");
            String ln = in.nextLine();
            System.out.println("Enter Employee Salary:");
            double sal = Double.parseDouble(in.nextLine());
            Emplist.add(new Employee(id,fn,ln,sal));
            System.out.println("Press -1 to exit or any other number to add next Employee:");
            option = in.nextInt();
            in.nextLine();
        }
//System.out.println(Emplist);
  String query = " INSERT INTO employee (id,fname,lname,salary) " + "Values (?,?,?,?)";

  for(int i = 0;i<Emplist.size();i++)
{
     try{
    Connection con = DatabaseConnection.getcon();
    PreparedStatement statement = con.prepareStatement(query);
    statement.setInt(1, Emplist.get(i).getID());
    statement.setString(2,Emplist.get(i).getFirstName());
    statement.setString(3, Emplist.get(i).getLastName());
    statement.setDouble(4,Emplist.get(i).getSalary());
    int updateRow = statement.executeUpdate();
    System.out.println(updateRow);
   }
   catch(SQLException e)
   {
    e.printStackTrace();
   }
}

    }
    public static void WriteSingleRecord()
    {
         //Write a single record to the database
    Employee E1 = new Employee(100,"Justin", "Seaward",200000);
   // System.out.println(E1);

   String query = " INSERT INTO employee (id,fname,lname,salary) " + "Values (?,?,?,?)";

   try{
    Connection con = DatabaseConnection.getcon();
    PreparedStatement statement = con.prepareStatement(query);
    statement.setInt(1, E1.getID());
    statement.setString(2,E1.getFirstName());
    statement.setString(3, E1.getLastName());
    statement.setDouble(4,E1.getSalary());
    int updateRow = statement.executeUpdate();
    System.out.println(updateRow);
       con.close();
   }
   catch(SQLException e)
   {
    e.printStackTrace();
   }
    }
    
}
