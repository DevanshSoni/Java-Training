import java.applet.Applet;
import java.awt.*;

public class AppletTest extends Applet
{
    public void paint(Graphics g)   // Graphics from java.awt.component
    {
        g.drawString("Hello World",40,40);
    }
}