import java.applet.Applet;
import java.awt.*;
public class MyAppletClass extends Applet
{
    public void paint(Graphics g)
    {
        
        g.drawString("Hello world",400,400);
        g.drawRect(200,200,200,200);
        g.setColor(Color.blue);
        g.fillRect(200,200,200,200);
        g.drawOval(200,200,200,200);
        g.setColor(Color.red);
        g.fillOval(200,200,200,200);
        g.drawOval(200,200,100,100);
        g.setColor(Color.yellow);
        g.fillOval(200,200,100,100);
        g.drawOval(200,200,200,150);
        g.setColor(Color.yellow);
        g.fillOval(200,200,100,100);
        g.drawOval(200,200,250,200);
        g.setColor(Color.yellow);
        g.fillOval(200,200,100,100);
        // g.fillArc(200,100,0,360);
        
    }
}