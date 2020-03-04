import java.awt.*;
import java.awt.event.*;   // Importing Event package
import java.lang.*;
class FormInJava extends Frame implements ActionListener
{
	TextField tf;
	TextField tf2,tf3,tf4;
	Label first;
	Label second, Gender,Experience,Email,Feedback,Sal;
	Label out1,out2,out3,out4,out5,out6,out7,out8;
    Checkbox cb1,cb2;
    CheckboxGroup cbg;
    Choice c;
    TextArea feed;
	Button btn,btn2;
	MenuBar obj;
	Menu m1;
	MenuItem mi1;
	FormInJava()
	{
		setSize(600,450);
		btn=new Button("Submit");
		btn2=new Button("Exit");
        feed=new TextArea();
		c=new Choice();
        c.add("Beginner");
        c.add("Intermeediate");
        c.add("Professional");
		out1=new Label();
		out2=new Label();
		out3=new Label();
		out4=new Label();
		out5=new Label();
		out6=new Label();
		out7=new Label();
		out8=new Label();
        tf=new TextField();
		tf2=new TextField();
        tf3=new TextField();
		tf4=new TextField();
        cbg=new CheckboxGroup();
        cb1=new Checkbox("Male",cbg,false);
        cb2=new Checkbox("Female",cbg,false);
		first=new Label("Full Name");
		second=new Label("Age");
        Gender=new Label("Gender");
        Experience=new Label("Experience");
        Email=new Label("Email");
        Feedback=new Label("Feedback");
        Sal=new Label("Expected Salary");
		obj=new MenuBar();
		m1=new Menu("Options");
		mi1=new MenuItem("Reset Fields");
		m1.add(mi1);
		obj.add(m1);
		mi1.addActionListener(this);



		out1.setBounds(320,50,120,20);
		out2.setBounds(320,90,120,20);
		out3.setBounds(320,120,120,20);
		out4.setBounds(320,180,120,20);
		out5.setBounds(320,210,200,20);
		out6.setBounds(320,230,200,70);
		out7.setBounds(320,300,120,20);

        feed.setBounds(200,230,80,70);
    	c.setBounds(200,180,80,20);
		btn.setBounds(120,350,55,35);
		btn2.setBounds(180,350,55,35);
		tf.setBounds(200,50,80,20);
		tf2.setBounds(200,90,80,20);	
		first.setBounds(50,50,80,20);
		second.setBounds(50,90,80,20);
        tf3.setBounds(200,210,80,20);
        tf4.setBounds(200,300,80,20);
        Gender.setBounds(50,120,80,20);
        cb1.setBounds(200,140,80,20);
        cb2.setBounds(200,160,80,20);
		Experience.setBounds(50,180,80,20);
        Email.setBounds(50,210,80,20);
		Feedback.setBounds(50,230,80,20);
        Sal.setBounds(50,300,120,20);
		
        btn.addActionListener(this);
		btn2.addActionListener(this);
        out1.setVisible(false);
		out2.setVisible(false);
		out3.setVisible(false);
		out4.setVisible(false);
		out5.setVisible(false);
		out6.setVisible(false);
		out7.setVisible(false);
		add(out1);
		add(out2);
		add(out3);
		add(out4);
		add(out5);
		add(out6);
		add(out7);
		add(out8);
        add(feed);
        add(c);
        add(cb1);
        add(cb2);
		add(btn);
		add(tf);
		add(tf2);
        add(tf3);
		add(tf4);
		add(first);
		add(second);
        add(Gender);
		add(Experience);
        add(Feedback);
		add(Email);
        add(Sal);
		add(btn2);
		setMenuBar(obj);
		setLayout(null);
		setVisible(true);
		setTitle("This is my First Window");
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == btn)
		{
			out1.setText("Name "+tf.getText());
			out2.setText("Age "+tf2.getText());
			if (cb1.getState()==true)
			{
				out3.setText("Gender "+cb1.getLabel());
			}
			else if (cb2.getState() == true)
			{
				out3.setText("Gender "+cb2.getLabel());
			}
			out4.setText("Experience "+c.getItem(c.getSelectedIndex()));
			out5.setText("Email "+tf3.getText());
			out6.setText("Feedback "+feed.getText());
			out7.setText("Salary "+tf4.getText());
			out1.setVisible(true);
			out2.setVisible(true);
			out3.setVisible(true);
			out4.setVisible(true);
			out5.setVisible(true);
			out6.setVisible(true);
			out7.setVisible(true);
		}
		else if(e.getSource()== btn2)
		{
			System.exit(0);
		}
		else if(e.getSource() == mi1)
		{
			tf.setText("");
			tf2.setText("");
			tf3.setText("");
			feed.setText("");
			tf4.setText("");
			cb1.setState(false);
			cb2.setState(false);
			out1.setText("");
			out2.setText("");
			out3.setText("");
			out4.setText("");
			out5.setText("");
			out6.setText("");
			out7.setText("");
			out8.setText("");
		}
		
	}
}
class TestFrame
{
	public static void main(String[] args)
	{
		FormInJava obj=new FormInJava();
	}
}