import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
public class PackMann
{
    private Color c;
    private int x, y, arcAngle, xv, yv, mouth;
    private Rectangle r;
    public PackMann(int x, int y)
    {
        c = Color.yellow;
        this.x = x;
        this.y = y;
        xv = 0;
        yv = 2;
        mouth = 6;
        arcAngle = 321;
        r = new Rectangle(x+3, y+3, 14, 14);
    }

    public Rectangle getR()
    {
        return r;
    }

    public void drawPacMan(Graphics2D gr)
    {
        gr.setColor(c);
        if(xv>0)
            gr.fillArc(x, y, 20, 20, 0, arcAngle);
        if(xv<0)
            gr.fillArc(x, y, 20, 20, 180, arcAngle);
        if(yv>0)
            gr.fillArc(x, y, 20, 20, 270, arcAngle);
        if(yv<0)
            gr.fillArc(x, y, 20, 20, 90, arcAngle);

        arcAngle += mouth;
        if(arcAngle >360 || arcAngle<320)
            mouth *= -1;
    }


    public void move()
    {
        x += xv;
        y += yv;
        if(x<0){
            x= 555;
        }
        if(x>560){
            x= 5;
        }
        r.setLocation(x, y);
    }

    public void moveUp(){
        xv = 0;
        yv = -5;
    }

    public void moveDown(){
        xv = 0;
        yv = 5;
    }

    public void moveLeft(){
        xv = -5;
        yv = 0;
    }

    public void moveRight(){
        xv = 5;
        yv = 0;
    }

    public void moveBack(){
        x -= xv;
        y -= yv;
        r.setLocation(x,y);
    }
}