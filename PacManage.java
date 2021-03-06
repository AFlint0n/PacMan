import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
public class PacManage extends JFrame implements Runnable, KeyListener
{
    Container con = getContentPane();
    Thread t = new Thread(this);
    PackMann p;
    ArrayList<GoldCoin> coins = new ArrayList<GoldCoin>();
    ArrayList<Rectangle> barriers = new ArrayList<Rectangle>();
    ArrayList<PowerCoin> Pcoin = new ArrayList<PowerCoin>();
    ArrayList<Ghosts> ghosts = new ArrayList<Ghosts>();
    public PacManage()
    {
        p = new PackMann(270, 520);

        //Ghosts
        ghosts.add(new Ghosts(270, 350, 1));
        ghosts.add(new Ghosts(270, 350, 2));
        ghosts.add(new Ghosts(270, 350, 3));
        ghosts.add(new Ghosts(270, 350, 4));

        //Power Pellets
        Pcoin.add(new PowerCoin(20,120));
        Pcoin.add(new PowerCoin(520,120));
        Pcoin.add(new PowerCoin(20,520));
        Pcoin.add(new PowerCoin(520,520));

        //top horizontal coins
        coins.add(new GoldCoin(20, 80));
        coins.add(new GoldCoin(40, 80));
        coins.add(new GoldCoin(60, 80));
        coins.add(new GoldCoin(80, 80));
        coins.add(new GoldCoin(100, 80));
        coins.add(new GoldCoin(120, 80));
        coins.add(new GoldCoin(140, 80));
        coins.add(new GoldCoin(160, 80));
        coins.add(new GoldCoin(180, 80));
        coins.add(new GoldCoin(200, 80));
        coins.add(new GoldCoin(220, 80));
        coins.add(new GoldCoin(240, 80));
        coins.add(new GoldCoin(300, 80));
        coins.add(new GoldCoin(320, 80));
        coins.add(new GoldCoin(340, 80));
        coins.add(new GoldCoin(360, 80));
        coins.add(new GoldCoin(380, 80));
        coins.add(new GoldCoin(400, 80));
        coins.add(new GoldCoin(420, 80));
        coins.add(new GoldCoin(440, 80));
        coins.add(new GoldCoin(460, 80));
        coins.add(new GoldCoin(480, 80));
        coins.add(new GoldCoin(500, 80));
        coins.add(new GoldCoin(520, 80));
        //second horizontal coins
        coins.add(new GoldCoin(20, 160));
        coins.add(new GoldCoin(40, 160));
        coins.add(new GoldCoin(60, 160));
        coins.add(new GoldCoin(80, 160));
        coins.add(new GoldCoin(100, 160));
        coins.add(new GoldCoin(120, 160));
        coins.add(new GoldCoin(140, 160));
        coins.add(new GoldCoin(160, 160));
        coins.add(new GoldCoin(180, 160));
        coins.add(new GoldCoin(200, 160));
        coins.add(new GoldCoin(220, 160));
        coins.add(new GoldCoin(240, 160));
        coins.add(new GoldCoin(260, 160));
        coins.add(new GoldCoin(280, 160));
        coins.add(new GoldCoin(300, 160));
        coins.add(new GoldCoin(320, 160));
        coins.add(new GoldCoin(340, 160));
        coins.add(new GoldCoin(360, 160));
        coins.add(new GoldCoin(380, 160));
        coins.add(new GoldCoin(400, 160));
        coins.add(new GoldCoin(420, 160));
        coins.add(new GoldCoin(440, 160));
        coins.add(new GoldCoin(460, 160));
        coins.add(new GoldCoin(480, 160));
        coins.add(new GoldCoin(500, 160));
        coins.add(new GoldCoin(520, 160));
        //third horizontal coins
        coins.add(new GoldCoin(20, 220));
        coins.add(new GoldCoin(40, 220));
        coins.add(new GoldCoin(60, 220));
        coins.add(new GoldCoin(80, 220));
        coins.add(new GoldCoin(100, 220));
        coins.add(new GoldCoin(120, 220));
        coins.add(new GoldCoin(180, 220));
        coins.add(new GoldCoin(200, 220));
        coins.add(new GoldCoin(220, 220));
        coins.add(new GoldCoin(240, 220));
        coins.add(new GoldCoin(300, 220));
        coins.add(new GoldCoin(320, 220));
        coins.add(new GoldCoin(340, 220));
        coins.add(new GoldCoin(360, 220));
        coins.add(new GoldCoin(420, 220));
        coins.add(new GoldCoin(440, 220));
        coins.add(new GoldCoin(460, 220));
        coins.add(new GoldCoin(480, 220));
        coins.add(new GoldCoin(500, 220));
        coins.add(new GoldCoin(520, 220));
        //fourth horizontal coins
        coins.add(new GoldCoin(20, 460));
        coins.add(new GoldCoin(40, 460));
        coins.add(new GoldCoin(60, 460));
        coins.add(new GoldCoin(80, 460));
        coins.add(new GoldCoin(100, 460));
        coins.add(new GoldCoin(120, 460));
        coins.add(new GoldCoin(140, 460));
        coins.add(new GoldCoin(160, 460));
        coins.add(new GoldCoin(180, 460));
        coins.add(new GoldCoin(200, 460));
        coins.add(new GoldCoin(220, 460));
        coins.add(new GoldCoin(240, 460));
        coins.add(new GoldCoin(300, 460));
        coins.add(new GoldCoin(320, 460));
        coins.add(new GoldCoin(340, 460));
        coins.add(new GoldCoin(360, 460));
        coins.add(new GoldCoin(380, 460));
        coins.add(new GoldCoin(400, 460));
        coins.add(new GoldCoin(420, 460));
        coins.add(new GoldCoin(440, 460));
        coins.add(new GoldCoin(460, 460));
        coins.add(new GoldCoin(480, 460));
        coins.add(new GoldCoin(500, 460));
        coins.add(new GoldCoin(520, 460));
        //fith horizontal y =520

        coins.add(new GoldCoin(40, 520));
        coins.add(new GoldCoin(60, 520));
        coins.add(new GoldCoin(120, 520));
        coins.add(new GoldCoin(140, 520));
        coins.add(new GoldCoin(160, 520));
        coins.add(new GoldCoin(180, 520));
        coins.add(new GoldCoin(200, 520));
        coins.add(new GoldCoin(220, 520));
        coins.add(new GoldCoin(240, 520));
        coins.add(new GoldCoin(300, 520));
        coins.add(new GoldCoin(320, 520));
        coins.add(new GoldCoin(340, 520));
        coins.add(new GoldCoin(360, 520));
        coins.add(new GoldCoin(380, 520));
        coins.add(new GoldCoin(400, 520));
        coins.add(new GoldCoin(420, 520));
        coins.add(new GoldCoin(480, 520));
        coins.add(new GoldCoin(500, 520));

        //sixth horizontal y=580
        coins.add(new GoldCoin(20, 580));
        coins.add(new GoldCoin(40, 580));
        coins.add(new GoldCoin(60, 580));
        coins.add(new GoldCoin(80, 580));
        coins.add(new GoldCoin(100, 580));
        coins.add(new GoldCoin(120, 580));
        coins.add(new GoldCoin(180, 580));
        coins.add(new GoldCoin(200, 580));
        coins.add(new GoldCoin(220, 580));
        coins.add(new GoldCoin(240, 580));
        coins.add(new GoldCoin(300, 580));
        coins.add(new GoldCoin(320, 580));
        coins.add(new GoldCoin(340, 580));
        coins.add(new GoldCoin(360, 580));
        coins.add(new GoldCoin(420, 580));
        coins.add(new GoldCoin(440, 580));
        coins.add(new GoldCoin(460, 580));
        coins.add(new GoldCoin(480, 580));
        coins.add(new GoldCoin(500, 580));
        coins.add(new GoldCoin(520, 580));
        //seventh horizontal
        coins.add(new GoldCoin(20, 640));
        coins.add(new GoldCoin(40, 640));
        coins.add(new GoldCoin(60, 640));
        coins.add(new GoldCoin(80, 640));
        coins.add(new GoldCoin(100, 640));
        coins.add(new GoldCoin(120, 640));
        coins.add(new GoldCoin(140, 640));
        coins.add(new GoldCoin(160, 640));
        coins.add(new GoldCoin(180, 640));
        coins.add(new GoldCoin(200, 640));
        coins.add(new GoldCoin(220, 640));
        coins.add(new GoldCoin(240, 640));
        coins.add(new GoldCoin(260, 640));
        coins.add(new GoldCoin(280, 640));
        coins.add(new GoldCoin(300, 640));
        coins.add(new GoldCoin(320, 640));
        coins.add(new GoldCoin(340, 640));
        coins.add(new GoldCoin(360, 640));
        coins.add(new GoldCoin(380, 640));
        coins.add(new GoldCoin(400, 640));
        coins.add(new GoldCoin(420, 640));
        coins.add(new GoldCoin(440, 640));
        coins.add(new GoldCoin(460, 640));
        coins.add(new GoldCoin(480, 640));
        coins.add(new GoldCoin(500, 640));
        coins.add(new GoldCoin(520, 640));
        //first vertical coins
        coins.add(new GoldCoin(20, 100));

        coins.add(new GoldCoin(20, 140));
        coins.add(new GoldCoin(20, 180));
        coins.add(new GoldCoin(20, 200));
        coins.add(new GoldCoin(20, 480));
        coins.add(new GoldCoin(20, 500));
        coins.add(new GoldCoin(20, 600));
        coins.add(new GoldCoin(20, 620));
        //second vertical coins
        coins.add(new GoldCoin(120, 100));
        coins.add(new GoldCoin(120, 120));
        coins.add(new GoldCoin(120, 140));
        coins.add(new GoldCoin(120, 180));
        coins.add(new GoldCoin(120, 200));
        coins.add(new GoldCoin(120, 220));
        coins.add(new GoldCoin(120, 240));
        coins.add(new GoldCoin(120, 260));
        coins.add(new GoldCoin(120, 280));
        coins.add(new GoldCoin(120, 300));
        coins.add(new GoldCoin(120, 320));
        coins.add(new GoldCoin(120, 340));
        coins.add(new GoldCoin(120, 360));
        coins.add(new GoldCoin(120, 380));
        coins.add(new GoldCoin(120, 400));
        coins.add(new GoldCoin(120, 420));
        coins.add(new GoldCoin(120, 440));
        coins.add(new GoldCoin(120, 480));
        coins.add(new GoldCoin(120, 500));
        coins.add(new GoldCoin(120, 540));
        coins.add(new GoldCoin(120, 560));
        //third vertical coins
        coins.add(new GoldCoin(420, 100));
        coins.add(new GoldCoin(420, 120));
        coins.add(new GoldCoin(420, 140));
        coins.add(new GoldCoin(420, 180));
        coins.add(new GoldCoin(420, 200));
        coins.add(new GoldCoin(420, 220));
        coins.add(new GoldCoin(420, 240));
        coins.add(new GoldCoin(420, 260));
        coins.add(new GoldCoin(420, 280));
        coins.add(new GoldCoin(420, 300));
        coins.add(new GoldCoin(420, 320));
        coins.add(new GoldCoin(420, 340));
        coins.add(new GoldCoin(420, 360));
        coins.add(new GoldCoin(420, 380));
        coins.add(new GoldCoin(420, 400));
        coins.add(new GoldCoin(420, 420));
        coins.add(new GoldCoin(420, 440));
        coins.add(new GoldCoin(420, 480));
        coins.add(new GoldCoin(420, 500));
        coins.add(new GoldCoin(420, 540));
        coins.add(new GoldCoin(420, 560));
        //fourth vertical coins
        coins.add(new GoldCoin(520, 100));
        coins.add(new GoldCoin(520, 140));
        coins.add(new GoldCoin(520, 180));
        coins.add(new GoldCoin(520, 200));
        coins.add(new GoldCoin(520, 480));
        coins.add(new GoldCoin(520, 500));
        coins.add(new GoldCoin(520, 600));
        coins.add(new GoldCoin(520, 620));
        //Misc Gold Coins
        coins.add(new GoldCoin(60, 540));
        coins.add(new GoldCoin(60, 560));
        coins.add(new GoldCoin(180, 540));
        coins.add(new GoldCoin(180, 560));
        coins.add(new GoldCoin(360, 540));
        coins.add(new GoldCoin(360, 560));
        coins.add(new GoldCoin(480, 540));
        coins.add(new GoldCoin(480, 560));
        coins.add(new GoldCoin(180, 180));
        coins.add(new GoldCoin(180, 200));
        coins.add(new GoldCoin(360, 180));
        coins.add(new GoldCoin(360, 200));
        coins.add(new GoldCoin(240, 100));
        coins.add(new GoldCoin(300, 100));
        coins.add(new GoldCoin(240, 120));
        coins.add(new GoldCoin(300, 120));
        coins.add(new GoldCoin(240, 140));
        coins.add(new GoldCoin(300, 140));
        coins.add(new GoldCoin(240, 480));
        coins.add(new GoldCoin(300, 480));
        coins.add(new GoldCoin(240, 500));
        coins.add(new GoldCoin(300, 500));
        coins.add(new GoldCoin(240, 600));
        coins.add(new GoldCoin(300, 600));
        coins.add(new GoldCoin(240, 620));
        coins.add(new GoldCoin(300, 620));

        //top barrier
        barriers.add(new Rectangle(0, 60, 560, 20));
        //leftedge
        barriers.add(new Rectangle(0, 60, 20, 200));
        barriers.add(new Rectangle(0, 240, 120, 20));
        barriers.add(new Rectangle(100, 240, 20, 100));
        barriers.add(new Rectangle(0, 320, 120, 20));
        barriers.add(new Rectangle(0, 360, 120, 20));
        barriers.add(new Rectangle(100, 360, 20, 100));
        barriers.add(new Rectangle(0, 440, 120, 20));
        barriers.add(new Rectangle(0, 440, 20, 240));
        barriers.add(new Rectangle(0, 540, 60, 40));
        //rightedge
        barriers.add(new Rectangle(540, 60, 20, 200));
        barriers.add(new Rectangle(440, 240, 120, 20));
        barriers.add(new Rectangle(440, 240, 20, 100));
        barriers.add(new Rectangle(440, 320, 120, 20));
        barriers.add(new Rectangle(440, 360, 120, 20));
        barriers.add(new Rectangle(440, 360, 20, 100));
        barriers.add(new Rectangle(440, 440, 120, 20));
        barriers.add(new Rectangle(540, 440, 20, 240));
        barriers.add(new Rectangle(500, 540, 60, 40));
        //left floating barriers
        barriers.add(new Rectangle(40, 100, 80, 60));
        barriers.add(new Rectangle(40, 180, 80, 40));
        barriers.add(new Rectangle(140, 100, 100, 60));
        barriers.add(new Rectangle(140, 180, 40, 160));
        barriers.add(new Rectangle(140, 240, 100, 40));
        barriers.add(new Rectangle(140, 360, 40, 100));
        barriers.add(new Rectangle(140, 480, 100, 40));
        barriers.add(new Rectangle(40, 480, 80, 40));
        barriers.add(new Rectangle(80, 480, 40, 100));
        barriers.add(new Rectangle(40, 600, 200, 40));
        barriers.add(new Rectangle(140, 540, 40, 100));
        //right floating barriers
        barriers.add(new Rectangle(440, 100, 80, 60));
        barriers.add(new Rectangle(440, 180, 80, 40));
        barriers.add(new Rectangle(320, 100, 100, 60));
        barriers.add(new Rectangle(380, 180, 40, 160));
        barriers.add(new Rectangle(320, 240, 100, 40));
        barriers.add(new Rectangle(380, 360, 40, 100));
        barriers.add(new Rectangle(320, 480, 100, 40));
        barriers.add(new Rectangle(440, 480, 80, 40));
        barriers.add(new Rectangle(440, 480, 40, 100));
        barriers.add(new Rectangle(320, 600, 200, 40));
        barriers.add(new Rectangle(380, 540, 40, 100));
        //Middle dividers
        barriers.add(new Rectangle(260, 60, 40, 100));
        barriers.add(new Rectangle(200, 180, 160, 40));
        barriers.add(new Rectangle(260, 180, 40, 100));
        barriers.add(new Rectangle(200, 420, 160, 40));
        barriers.add(new Rectangle(260, 420, 40, 100));
        barriers.add(new Rectangle(200, 540, 160, 40));
        barriers.add(new Rectangle(260, 540, 40, 100));
        //bottom barrier
        barriers.add(new Rectangle(0, 660, 560, 20));
        //ghost box
        barriers.add(new Rectangle(200, 300, 60, 20));
        barriers.add(new Rectangle(300, 300, 60, 20));
        barriers.add(new Rectangle(200, 300, 20, 100));
        barriers.add(new Rectangle(200, 380, 160, 20));
        barriers.add(new Rectangle(340, 300, 20, 100));

        con.setLayout(new FlowLayout());
        addKeyListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        t.start();
    }

    public void run()
    {
        try{
            while(true)
            {
                t.sleep(33);//Smaller number == faster, larger == slower
                p.move();
                for(int x = 0; x < coins.size(); x++)
                {
                    if(p.getR().intersects(coins.get(x).getR()))
                    {
                        coins.get(x).eatCoin();
                    }
                }
                for(int x= 0; x< ghosts.size(); x++){
                    ghosts.get(x).move();
                }
                for(int x = 0; x < Pcoin.size(); x++)
                {
                    if(p.getR().intersects(Pcoin.get(x).getR())){
                        Pcoin.get(x).eatPowerCoin();
                    }
                }
                for(int x= 0; x< barriers.size(); x++){
                    if(p.getR().intersects(barriers.get(x)))
                    {
                        p.moveBack();
                    }
                }
                for(int x= 0; x< ghosts.size(); x++){
                    if(p.getR().intersects(ghosts.get(x).getR())){
                        System.exit(0);
                    }
                    for(int y=0; y< barriers.size(); y++){
                        if(ghosts.get(x).getR().intersects(barriers.get(y)))
                        {
                            ghosts.get(x).change();
                        }
                    }
                }
                repaint();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void paint(Graphics gr)
    {
        Image i=createImage(getSize().width, getSize().height);
        Graphics2D painter = (Graphics2D)i.getGraphics();
        painter.fillRect(0, 0, 560, 720);
        for(int x = 0; x < coins.size(); x++)
        {
            coins.get(x).drawCoin(painter);
        }

        painter.setColor(Color.blue);
        painter.setStroke(new BasicStroke(4));
        for(int x = 0; x < barriers.size(); x++)
        {
            painter.draw(barriers.get(x));
        }

        for(int x = 0; x < Pcoin.size(); x++)
        {
            Pcoin.get(x).drawPowerCoin(painter);
        }

        for(int x = 0; x < ghosts.size(); x++)
        {
            ghosts.get(x).drawGhost(painter);
        }

        p.drawPacMan(painter);
        painter.dispose();
        gr.drawImage(i, 0, 0, this);
    }

    public static void main(String[] args)
    {
        PacManage frame = new PacManage();
        frame.setSize(600, 768);//determines size of screen
        frame.setVisible(true);
    }

    public void update(Graphics g)
    {
        paint(g);
    }

    public void keyPressed(KeyEvent k){
        if(k.getKeyCode() == 37){
            p.moveLeft();
        }
        if(k.getKeyCode() == 38){
            p.moveUp();
        }
        if(k.getKeyCode() == 39){
            p.moveRight();
        }
        if(k.getKeyCode() == 40){
            p.moveDown();
        }
    }

    public void keyReleased(KeyEvent k){

    }

    public void keyTyped(KeyEvent k){}
}