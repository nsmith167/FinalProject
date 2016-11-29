import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameView extends JPanel{
    
    private GameModel gModel;
    
    private GridBagConstraints gbc;
    
    private JLabel gameLabel;
    
    private JPanel colorPane;
    private JLabel colorOptionLabel;
    private JLabel colorOption;
    
    private JPanel speedPane;
    private JLabel speedOptionLabel;
    private JLabel speedOption;
    
    private JPanel appleSizePane;
    private JLabel appleSizeOptionLabel;
    private JLabel appleSizeOption;
    
    GameView(GameModel gModel) {
        
        this.gModel = gModel;
        
        this.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        
        gameLabel = new JLabel("Game View");
        
        colorPane = new JPanel();
        colorOptionLabel = new JLabel("Color:");
        colorOption = new JLabel("No Option Selected");
        
        speedPane = new JPanel();
        speedOptionLabel = new JLabel("Snake Speed:");
        speedOption = new JLabel("No Option Selected");
        
        appleSizePane = new JPanel();
        appleSizeOptionLabel = new JLabel("Apple Size:");
        appleSizeOption = new JLabel("No Option Selected");
           
        //Positioning, padding, alignment, etc.
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10,10,10,10);
        this.add(gameLabel);
        
        gbc.gridy++;
        colorPane.add(colorOptionLabel);
        colorPane.add(colorOption);
        this.add(colorPane, gbc);
        
        gbc.gridy++;
        speedPane.add(speedOptionLabel);
        speedPane.add(speedOption);
        this.add(speedPane, gbc);
        
        gbc.gridy++;
        appleSizePane.add(appleSizeOptionLabel);
        appleSizePane.add(appleSizeOption);
        this.add(appleSizePane, gbc);
        
    }
    
    public void setLabels(Color snakeColor, int snakeSpeed, int appleSize) {
        
        if(snakeColor.equals(Color.GREEN)) {
            colorOption.setText("Green");
        }
        else if(snakeColor.equals(Color.BLUE)) {
            colorOption.setText("Blue");
        }
        else if(snakeColor.equals(Color.BLACK)) { //Default value before the user has selected a difficulty
            colorOption.setText("No Option Selected");
        }
        
        if(snakeSpeed == 1) {
            speedOption.setText("Slow");
        }
        else if(snakeSpeed == 2) {
            speedOption.setText("Medium");
        }
        else if(snakeSpeed == 3) {
            speedOption.setText("Fast");
        }
        
        if(appleSize == 15) {
            appleSizeOption.setText("Small");
        }
        else if(appleSize == 20) {
            appleSizeOption.setText("Medium");
        }
        else if(appleSize == 25) {
            appleSizeOption.setText("Large");
        }
        
    }
    
}
