import java.awt.*;
import java.awt.event.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

class Signup extends Frame implements ActionListener
{  
    TextField txt1,txt2,txt3,txt4;
    Label lbl1,lbl2,lbl3,lbl4;
    Button btn,btn2;
    Signup()
    {
        setSize(400,400);
        txt1=new TextField();
        txt2=new TextField();
        txt3=new TextField();
        txt4=new TextField();
        txt4.setEchoChar('*');
        lbl1=new Label("Full Name");
        lbl2=new Label("Email");
        lbl3=new Label("Phone");
        lbl4=new Label("Password");
        btn=new Button("Submit");
        btn2=new Button("Exit");
        lbl1.setBounds(15,30,80,20);
        lbl2.setBounds(15,60,80,20);
        lbl3.setBounds(15,90,80,20);
        lbl4.setBounds(15,120,80,20);
        txt1.setBounds(120,30,150,20);
        txt2.setBounds(120,60,150,20);
        txt3.setBounds(120,90,150,20);
        txt4.setBounds(120,120,150,20);
        btn.setBounds(40,260,100,20);
        btn2.setBounds(150,260,100,20);
        btn.addActionListener(this);
        btn2.addActionListener(this);
        add(lbl1);
        add(lbl2);
        add(txt1);
        add(txt2);
        add(txt3);
        add(txt4);
        add(btn);
        add(btn2);
        add(lbl3);add(lbl4);
        setVisible(true);
        setTitle("Signup Form");
        setLayout(null);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == btn)
        {
        String name= txt1.getText();
        String email= txt2.getText();
        String phone= txt3.getText();
        String password= txt4.getText();
            try
            {
                Class.forName("java.sql.Driver");
                Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","");
                Statement stmt=(Statement)con.createStatement();
                String query="insert into signup values('"+name+"','"+email+"','"+phone+"','"+password+"')";
                stmt.executeUpdate(query);
                con.close();
                stmt.close();
                JOptionPane.showMessageDialog(null,"Successfully Signed Up");
            }
            catch(Exception wrong)
            {
                wrong.printStackTrace();
            }
        }
        else if(e.getSource() == btn2)
        {
            System.exit(0);
        } 
    }
}

class TestSignup
{
    public static void main(String[] args)
    {
        Signup obj=new Signup();
    }
}