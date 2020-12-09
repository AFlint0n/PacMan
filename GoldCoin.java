import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
public class GoldCoin
{
    private Color c;
    private int x, y;
    private Rectangle r;
    private boolean visible;
    public GoldCoin(int xx, int yy)
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

    public void drawCoin(Graphics2D gr)
    {
        gr.setColor(c);
        if(visible)
            gr.fillOval(x+5, y+5, 10, 10);
    }

    public void eatCoin()
    {
        visible = false;
        x = 0;
        y = 0;
        r.setLocation(x,y);
    }
}