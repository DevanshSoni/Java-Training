import java.awt.*;
import java.awt.event.*;   // Importing Event package
import java.lang.*;
class First extends Frame implements ActionListener
{
	TextField tf;
	TextField tf2;
	Label first;
	Label second;
	Label result;
	Button btn,btn2;
	First()
	{
		setSize(350,300);
		btn=new Button("Add");
		btn2=new Button("Exit");
		tf=new TextField();
		tf2=new TextField();
		first=new Label("Enter First");
		second=new Label("Enter Second");
		result=new Label("");
		btn.setBounds(120,200,55,35);
		btn2.setBounds(180,200,55,35);
		tf.setBounds(150,50,80,20);
		tf2.setBounds(150,90,80,20);	
		first.setBounds(50,50,80,20);
		second.setBounds(50,90,80,20);
		result.setBounds(100,250,80,20);
		btn.addActionListener(this);
		btn2.addActionListener(this);
		add(btn);
		add(tf);
		add(tf2);
		add(first);
		add(second);
		add(result);
		add(btn2);
		setLayout(null);
		setVisible(true);
		setTitle("This is my First Window");
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == btn)
		{
			int a=Integer.parseInt(tf.getText());
			int b=Integer.parseInt(tf2.getText());
			result.setText((a+b)+"");
		}
		else if(e.getSource()== btn2)
		{
			System.exit(0);
		}
		
	}
}
class TestFrame
{
	public static void main(String[] args)
	{
		First obj=new First();
	}
}