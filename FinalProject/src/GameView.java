import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameView extends JPanel{
    
    private GameModel gModel;
    
    private JLabel gameLabel;
    private JLabel colorOptionLabel;
    private JLabel colorOption;
    private JLabel speedOptionLabel;
    private JLabel speedOption;
    private JLabel appleSizeOptionLabel;
    private JLabel appleSizeOption;
    
    GameView(GameModel gModel) {
        
        this.gModel = gModel;
        
            gameLabel = new JLabel("Game View");
            colorOptionLabel = new JLabel("Color:");
            colorOption = new JLabel("No Option Selected");
            speedOptionLabel = new JLabel("Snake Speed:");
            speedOption = new JLabel("No Option Selected");
            appleSizeOptionLabel = new JLabel("Apple Size:");
            appleSizeOption = new JLabel("No Option Selected");
            
        
        add(gameLabel);
        add(colorOptionLabel);
        add(colorOption);
        add(speedOptionLabel);
        add(speedOption);
        add(appleSizeOptionLabel);
        add(appleSizeOption);
        
    }
    
    public void setLabels(Color snakeColor, int snakeSpeed, int appleSize)
    {
        if(snakeColor.equals(Color.GREEN))
            colorOption.setText("Green");
        else if(snakeColor.equals(Color.BLUE))
            colorOption.setText("Blue");
        else if(snakeColor.equals(Color.BLACK)) //Default value before the user has selected a difficulty
            colorOption.setText("No Option Selected");
        
        if(snakeSpeed == 1)
            speedOption.setText("Slow");
        else if(snakeSpeed == 2)
            speedOption.setText("Medium");
        else if(snakeSpeed == 3)
            speedOption.setText("Fast");
        
        if(appleSize == 15)
            appleSizeOption.setText("Small");
        else if(appleSize == 20)
            appleSizeOption.setText("Medium");
        else if(appleSize == 25)
            appleSizeOption.setText("Large");
    }
    
}
