
import java.awt.*;
public class Ball
{
    private int x, y, size, count;
    public Ball(int x, int y, int size)
    {
        this.x=x;
        this.y=y;
        this.size=size;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getSize(){
        return size;
    }

public void move(int count)
{
   x = x + count;
}
public void draws(Graphics g)
{
    g.fillOval(x, y, size, size);
}

}
