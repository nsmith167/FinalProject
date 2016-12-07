import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class GameView extends JPanel implements KeyListener, ActionListener
{   
    private Dot currApple; //"apple" currently displayed on the screen 
    private Snake snake; 
    private boolean running; //whether or not the game is running
    private Timer timer; 
    private boolean collided; //whether or not the snake collided with something
    private boolean dead;
    private boolean ate; //whether or not the snake ate an apple
    private boolean saved; //whether or not the data has been saved after death
    private int delay = 70; //delays the "ticks" of the timer
    private int score;
    private JLabel scoreDisplay;
    private JPanel deadPanel;
    private GridBagConstraints gbc;
    private JLabel nameLabel;
    private JTextField nameInput;
    private JButton saveButton;
    private String name;
    
    private final int PADDING = 30; //closest any dot can be to the edge of the panel
    private final int WIDTH = 768;
    private final int HEIGHT = 560;
    
    GameView() 
    { 
        this.setBackground(new Color(235, 252, 244));
        score = 0;
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        currApple = new Dot(75, 75, new Color(214, 73, 73), 15);
        snake = new Snake(200, 200);
        collided = false;
        dead = false;
        ate = false;
        saved = false;
        scoreDisplay = new JLabel();
        scoreDisplay.setPreferredSize(new Dimension(100, 25));
        scoreDisplay.setText("Score: " + score);
        add(scoreDisplay);
        addKeyListener(this);
        setFocusable(true); //allows the panel to take input from the keyboard
        
        //Components to display upon death
        deadPanel = new JPanel();
        deadPanel.setPreferredSize(new Dimension(300, 500));
        deadPanel.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        deadPanel.setBackground(new Color(235, 252, 244));
        nameLabel = new JLabel("<html><p style=\"text-align:center;font-size:12px\"><b>You died! Enter your name:</b></p></html>");
        nameInput = new JTextField(15);
        saveButton = new JButton("Save");
        saveButton.addActionListener(new SaveButtonListener());
        saveButton.setBackground(new Color(176, 232, 204));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        deadPanel.add(nameLabel, gbc);
        gbc.gridy++;
        deadPanel.add(nameInput, gbc); 
        gbc.gridy++;
        deadPanel.add(saveButton, gbc);
        
    }
    
    class SaveButtonListener implements ActionListener 
        {  
            @Override
            public void actionPerformed(ActionEvent e) 
            {            
                name = nameInput.getText();  
                saved = true;
            }
        }
    
    //Runs the game
    public void run()
    {
        running = true;
        timer = new Timer(delay, this); //initializes the timer
        timer.start();
        
    }
    
    //Pauses the game where it is
    public void pause()
    {
        running = false;
    }
    @Override
    /*
    * The timer creates an action event on every "tick" which calls this method
    * Essentially, this is what we want the game to do on every "tick" of the timer
    */
    public void actionPerformed(ActionEvent e) 
    {
        if(running == true && dead == false) //dead variable is a failsafe in case user changes panels after death
        {
            snake.move();
            
            if(collided())
                dead();
            if(ate())
            {
                score += 100;
                currApple.setX(PADDING + (int)(Math.random() * (WIDTH - PADDING - currApple.getThickness())));
                currApple.setY(PADDING + (int)(Math.random() * (HEIGHT - PADDING - currApple.getThickness())));
                ate = false;
            }
        }
        repaint(); //In this case calls paintComponent()
    }
    
    @Override
    /*
    * Refreshes the screen. Should draw all elements of the game that need to be displayed within the panel.
    */
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        snake.draw(g);
        currApple.draw(g);  
        scoreDisplay.setText("Score: " + score);
    }
    
    @Override
    /*
    * Triggered any time a key on the keyboard is pressed.
    * Uses input from the arrow keys to set the snake's direction
    */
    public void keyPressed(KeyEvent e) 
    {   
        if(e.getKeyCode() == KeyEvent.VK_UP && snake.getDirection() != 'd')
            snake.setDirection('u');
        else if(e.getKeyCode() == KeyEvent.VK_DOWN && snake.getDirection() != 'u')
            snake.setDirection('d');
        else if(e.getKeyCode() == KeyEvent.VK_LEFT && snake.getDirection() != 'r')
            snake.setDirection('l');
        else if(e.getKeyCode() == KeyEvent.VK_RIGHT && snake.getDirection() != 'l')
            snake.setDirection('r'); 
    }
   
    public boolean collided()
    {
        if(snake.getSize() > 1)
        {
            for(int i = 1; i < snake.getSize(); i++)
            {
                if(snake.getX() == snake.getBody().get(i).getX() && snake.getY() == snake.getBody().get(i).getY())
                    collided = true;
            }
        }
        if(snake.getX() < 0 || (snake.getX() + snake.getThickness()) > WIDTH || snake.getY() < 0 || (snake.getY() + snake.getThickness()) > HEIGHT)
            collided = true;
        
        return collided;
    }
    
    public boolean ate()
    {
        if((snake.getX() + snake.getThickness()) >= currApple.getX() && snake.getX() <= (currApple.getX() + currApple.getThickness()) && (snake.getY() + snake.getThickness()) >= currApple.getY() && snake.getY() <= (currApple.getY() + currApple.getThickness()))
        {
            ate = true;
            snake.grow();
        }
        return ate;
    }
    
    public void dead()
    {
        running = false;
        dead = true;
        add(deadPanel);
        revalidate();
    }
    
    public void setSnakeValues(int speed, Color color)
    {
        if(speed == 1)
            delay = 80;
        else if(speed == 2)
            delay = 90;
        else if(speed == 3)
            delay = 100;
        snake.setColor(color);
    }
    
    public void setAppleSize(int size)
    {
        currApple.setThickness(size);
    }
    
    public String saveName()
    {
        return name;
    }
    
    public int saveScore()
    {
        return score;
    }
    
    public boolean pressedSave()
    {
        return saved;
    }
    
    public void resetSave()
    {
        saved = false;
    }
    
    @Override
    public void keyReleased(KeyEvent e) 
    {
        //does nothing
    }

    @Override
    public void keyTyped(KeyEvent e) 
    {
      //does nothing
    }    
    
}
