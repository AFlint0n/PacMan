import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
public class PowerCoin
{
    private Color c;
    private int x, y;
    private Rectangle r;
    private boolean visible;
    public PowerCoin(int xx, int yy)
    {
        c = Color.yellow;
        x = xx;
        y = yy;
        visible = true;
        r = new Rectangle(x, y, 20, 20);
    }

    public Rectangle getR()
    {
        return r;
    }

    public void drawPowerCoin(Graphics2D gr)
    {
        gr.setColor(c);
        if(visible)
            gr.fillOval(x, y, 20, 20);
    }

    public void eatPowerCoin()
    {
        visible = false;
        x = 0;
        y = 0;
        r.setLocation(x,y);
    }
}