
import java.awt.Color;


public class OptionModel 
{
    
    private int snakeSpeed;
    private int appleSize;
    private Color currSnakeColor;
    
    OptionModel() 
    {
        //Default values to represent that the user has not selected any options
        snakeSpeed = -1;
        appleSize = -1;
        currSnakeColor = Color.BLACK;
    }
    
    public void setSnakeSpeed(int speed)
    {
        this.snakeSpeed = speed;
    }
    
    public int getSnakeSpeed()
    {
        return snakeSpeed;
    }
    
    public void setAppleSize(int size)
    {
        this.appleSize = size;
    }
    
    public int getAppleSize()
    {
        return appleSize;
    }
    
    public void setSnakeColor(Color color)
    {
        this.currSnakeColor = color;
    }
    
    public Color getSnakeColor()
    {
        return currSnakeColor;
    }
}
