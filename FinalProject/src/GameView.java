
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
    
}
