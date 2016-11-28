import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameView extends JPanel{
    
    private GameModel gModel;
    
    private JLabel gameLabel;
    private JLabel colorOptionLabel;
    private JLabel colorOption;
    private JLabel diffOptionLabel;
    private JLabel diffOption;
    
    GameView(GameModel gModel) {
        
        this.gModel = gModel;
        
            gameLabel = new JLabel("Game View");
            colorOptionLabel = new JLabel("Color:");
            colorOption = new JLabel("No Option Selected");
            diffOptionLabel = new JLabel("Difficulty:");
            diffOption = new JLabel("No Option Selected");
        
        add(gameLabel);
        add(colorOptionLabel);
        add(colorOption);
        add(diffOptionLabel);
        add(diffOption);
        
    }
    
    public void setLabels(Color snakeColor, int difficulty)
    {
        if(snakeColor.equals(Color.GREEN))
            colorOption.setText("Green");
        else if(snakeColor.equals(Color.BLUE))
            colorOption.setText("Blue");
        else if(snakeColor.equals(Color.BLACK)) //Default value before the user has selected a difficulty
            colorOption.setText("No Option Selected");
        
        if(difficulty == 1)
            diffOption.setText("Easy");
        else if(difficulty == 2)
            diffOption.setText("Medium");
        else if(difficulty == 3)
            diffOption.setText("Hard");
        else if(difficulty == -1) //Default value before the user has selected a difficulty
            diffOption.setText("No Option Selected");
    }
    
}
