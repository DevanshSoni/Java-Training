import java.awt.*;
import java.awt.event.*;

class MyCountFrame extends Frame implements ActionListener
{
    Button count;
    TextArea area;
    // Label lbl1,Words,Characters;
    TextField tf1,tf2;
    MyCountFrame()
    {
        
        Label lbl1=new Label("Enter Text");
        Label Words=new Label("Words");
        Label Characters=new Label("Characters");
        tf1=new TextField();
        tf2=new TextField();
        area=new TextArea();
        count=new Button("Count It");
        
        tf1.setBounds(200,250,50,20);
        add(tf1);
        tf2.setBounds(200,320,50,20);
        add(tf2);
        lbl1.setBounds(50,50,70,40);
        add(lbl1);
        area.setBounds(180,60,120,80);
        add(area);
        count.setBounds(120,180,60,20);
        add(count); 
        Words.setBounds(80,250,50,20);
        add(Words);
        Characters.setBounds(80,280,90,20);
        add(Characters);
        
        setSize(500,500);

        count.addActionListener(this);      
        setVisible(true);
        setLayout(null);
        setTitle("Count Program");
    }
    public void actionPerformed(ActionEvent e)
    {
            int countwords=0;
            int countcharacters=0;
            String names[]= area.getText().split("\n",100);
            System.out.println(names);
            for (int i=0;i<names.length;i++)
            {
                String []inner=names[i].split(" ",100);
                countwords+=inner.length;
                for(int j=0;j<inner.length;j++)
                {
                    countcharacters+=inner[j].length();
                }
            }
            tf1.setText(""+countwords);
            tf2.setText(""+countcharacters);
    }
}

class TestCountFrame
{
    public static void main(String[] args)
    {
        MyCountFrame obj=new MyCountFrame();
    }
}