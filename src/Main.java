import java.awt.*;
import javax.swing.*;
public class Main{
    public static void main(String[] args)
    {
    System.out.println("made a comment in replit");
    System.out.println("comment from intelij");
        JFrame myFrame = new JFrame();
        myFrame.setSize(500, 500);

        BallPanel bPanel = new BallPanel();

        //myFrame.add(myPanel);
        myFrame.add(bPanel);

        myFrame.setVisible(true);


    }
}