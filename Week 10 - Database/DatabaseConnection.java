import java.sql.*;//Connection, DeviceManager, SQLException

public class DatabaseConnection{

    private static final String url = "jdbc:postgresql://localhost:5432/postgres";
    private static final String user = "postgres";
    private static final String password = "password";
    public static Connection getcon()
    {
        Connection connection = null;
        try{
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, user, password);
        }
        catch(ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }



        return connection;
    }

}