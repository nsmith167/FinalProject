
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Snake 
{
    private ArrayList<Dot> body;
    private int size;
    private int x, y;
    private Dot head;
    private char direction;
    
    //Initializes snake with given x and y coordinates
    public Snake(int x, int y)
    {
        this.x = x;
        this.y = y;
        body = new ArrayList<Dot>(0);
        head = new Dot(x, y, Color.GREEN, 15); //First "dot" in the body
        body.add(head); 
        size = 1;
  
    }
    
    public int getSize()
    {
        return size;
    }
    
    public int getThickness()
    {
        return head.getThickness();
    }
    public int getX()
    {
        return head.getX();
    }
    
    public int getY()
    {
        return head.getY();
    }
    
    public char getDirection()
    {
        return direction;
    }
    
    public void setDirection(char direction) //l, r, u, d
    {
        this.direction = direction;
    }
    
    public ArrayList<Dot> getBody()
    {
        return body;
    }
    
    public void setColor(Color color)
    {
        for(Dot d: body)
            d.setColor(color);
    }
    /*
    * Changes the coordinates of each "dot" in the body
    */
    public void move() 
    {
        //From last dot to dot before head, each dot takes coordinates of previous dot
        for(int i = (size - 1); i > 0; i--)
        {
            body.get(i).setX(body.get(i - 1).getX());
            body.get(i).setY(body.get(i - 1).getY());
        }
        
        /*
        * If-else structure to handle the new placement of the head based on
        * direction set by keyboard input in GamePanel
        */
        if(direction == 'l')
        {
            head.setX(head.getX() - head.getThickness());
            this.direction = 'l';
        }
        else if(direction == 'r')
        {
            head.setX(head.getX() + head.getThickness());
            this.direction = 'r';
        }
        else if(direction == 'u')
        {
            head.setY(head.getY() - head.getThickness());
            this.direction = 'u';
        }
        else if(direction == 'd')
        {
            head.setY(head.getY() + head.getThickness());
            this.direction = 'd';
        }    
    }
    
    /*
    * Grow method adds a new dot to the body
    * This dot is not given meaningful coordinates until "move" is called next
    */
    public void grow()  
    {
        body.add(new Dot(-100, -100, head.getColor(), 15)); //should not be visible until move() is called
        size++;
    }
    
    //Instructions about how to graphically draw the snake's body
    public void draw(Graphics g)
    {
        for(Dot d: body)
            d.draw(g);
    }
}

