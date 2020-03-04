import java.awt.*;
import java.awt.event.*;

class MyFrame2 extends Frame implements ActionListener
{  
    TextField txt1,txt2;
    Label lbl1,lbl2,lbl3;
    Button btn,btn2;
    MyFrame2()
    {
        setSize(250,250);
        txt1=new TextField();
        txt2=new TextField();
        lbl1=new Label("First Number");
        lbl2=new Label("Second Number");
        lbl3=new Label("");
        btn=new Button("Add");
        btn2=new Button("Exit");
        lbl1.setBounds(30,30,80,20);
        lbl2.setBounds(30,60,100,20);
        txt1.setBounds(150,30,50,20);
        txt2.setBounds(150,60,50,20);
        lbl3.setBounds(40,160,80,20);
        btn.setBounds(40,110,50,20);
        btn2.setBounds(80,110,50,20);
        btn.addActionListener(this);
        btn2.addActionListener(this);
        add(lbl1);
        add(lbl2);
        add(txt1);
        add(txt2);
        add(btn);
        add(lbl3);
        add(btn2);
        setVisible(true);
        setTitle("Add Two Numbers");
        setLayout(null);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == btn)
        {
        int a= Integer.parseInt(txt1.getText());
        int b= Integer.parseInt(txt2.getText());
        lbl3.setText("Result :-   "+(a+b));
        }
        else if(e.getSource() == btn2)
        {
            System.exit(0);
        } 
    }
}

class TestMultipleAdd
{
    public static void main(String[] args)
    {
        MyFrame2 obj=new MyFrame2();
    }
}