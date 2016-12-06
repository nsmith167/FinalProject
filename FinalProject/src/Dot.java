
import java.awt.Color;
import java.awt.Graphics;

public class Dot 
{
    private int x;
    private int y;
    private Color color;
    private int thickness;
    
    public Dot(int x, int y, Color color, int thickness)
    {
        this.x = x;
        this.y = y;
        this.color = color;
        this.thickness = thickness;
    }
    
    public int getX()
    {
        return x;
    }
    
    public void setX(int x)
    {
        this.x = x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public void setY(int y)
    {
        this.y = y;
    }
    
    public int getThickness()
    {
        return thickness;
    }
    
    public void setThickness(int thickness)
    {
        this.thickness = thickness;
    }
    
    public Color getColor()
    {
        return color;
    }
    
    public void setColor(Color color)
    {
        this.color = color;
    }
    
    public void draw(Graphics g)
    {
        g.setColor(color);
        g.fillRect(x, y, thickness, thickness);
    }
}
