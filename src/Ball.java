
public class Ball
{
    private int x, y, size;
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

public void moveRight()
{
   x = x + 2;
}
}
