import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame
{
    MyFrame()
    {
        Button obj=new Button("Click me to see Magic");
        Button obj2=new Button("Bigger Magic");
        setSize(300,300);
        obj.setBounds(80,80,130,20);
        obj2.setBounds(80,150,100,20);
        add(obj);
        add(obj2);
        setLayout(null);
        setVisible(true);
        setTitle("Practice Window");
    }
}

class TestFrame 
{
    public static void main(String[] args)
    {
        MyFrame obj=new MyFrame();
    }
}