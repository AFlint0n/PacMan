import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
public class Ghosts
{
    private int c;
    private int x, y, arcAngle, xv, yv, mouth;
    private Rectangle r;
    public Ghosts(int xx, int yy, int cc)
    {    
        c = cc;
        x = xx;
        y = yy;
        xv = 0;
        yv = -10;
        r = new Rectangle(x+2, y+2, 16, 16);
        //r = new Rectangle(x+2, y+2, 16, 16);
        //r = new Rectangle(x+2, y+2, 16, 16);
        //r = new Rectangle(x+2, y+2, 16, 16);
    }

    public Rectangle getR()
    {
        return r;
    }

    public void drawGhost(Graphics2D gr)
    {

        if(c==1){
            gr.setColor(Color.red);
            gr.fillRect(x+2, y+2, 16, 16);
        }
        else if(c==2){
            gr.setColor(Color.cyan);
            gr.fillRect(x+2, y+2, 16, 16);
        }
        else if(c==3){
            gr.setColor(Color.orange);
            gr.fillRect(x+2, y+2, 16, 16);
        }
        else if(c==4){
            gr.setColor(Color.magenta);
            gr.fillRect(x+2, y+2, 16, 16);
        }
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

    public void change(){
        x -= xv;
        y -= yv;
        int test= (int)(Math.random()*4)+1;
        if(test==1){
            xv=5;   
            yv=0;
        }
        else if(test==2){
            xv=-5;
            yv=0;
        }
        else if(test==3){
            xv=0;
            yv=5;   
        }
        else{
            xv=0;
            yv=-5;
        }
        r.setLocation(x,y);
    }
}
