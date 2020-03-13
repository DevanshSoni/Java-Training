import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

class GettingData
{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("java.sql.Driver");
            Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","");
            Statement stmt=(Statement)con.createStatement();
            String query="select * from signup";
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next())
            {
                System.out.println("Name :- "+rs.getString("name"));
                System.out.println("Email :- "+rs.getString("email"));
            }
            con.close();
            stmt.close();
            rs.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}