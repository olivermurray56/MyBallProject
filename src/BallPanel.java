import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BallPanel extends JPanel
{

    ArrayList<Ball> balls = new ArrayList<Ball>();

    int x = 80;
    int y = 20;
    int xSpeed = 3;
    int ySpeed = 3;

  
    public BallPanel()
    {

        for (int i= 0; i<20; i++)
  {

      balls.add(new Ball((int)(Math.random()*350+1) , (int)(Math.random()*350+1) , (int)(Math.random()*1+1)));
      //tester
      //  balls.add(new Ball(10, 10, 100));
  }




        setFocusable(true);
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
System.out.println(e.getKeyCode());
int z = e.getKeyCode();
if(z == 68)
{
 
}
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        setBackground(Color.RED);
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        //super.paintComponent(g);
        //g.fillOval(x, y, 10, 10);
        //g.fillOval(one.getX(), one.getY(), one.getSize(), one.getSize());
     // one.moveRight();
        for (int i = 0; i<20; i++)
        {
        balls.get(i).draws(g);
        }
        x+= xSpeed;
        y+=ySpeed;
        if(x>=getWidth() || x<=0)
        {
            xSpeed*=-1;
        }
        if (y>=getHeight()-10 || y<=0)
        {
            ySpeed*=-1;
        }


        try{
            Thread.sleep(10);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }



        repaint();
    }
}