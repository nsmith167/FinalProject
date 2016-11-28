
import java.awt.Color;


public class OptionModel 
{
    
    private int difficulty;
    private Color currSnakeColor;
    
    OptionModel() 
    {
        //Default values to represent that the user has not selected any options
        difficulty = -1;
        currSnakeColor = Color.BLACK;
    }
    
    public void setDifficulty(int difficulty)
    {
        this.difficulty = difficulty;
    }
    
    public int getDiffculty()
    {
        return difficulty;
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
