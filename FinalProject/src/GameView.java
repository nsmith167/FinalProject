
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameView extends JPanel{
    
    GameModel gModel;
    
    JLabel gameLabel;
    
    GameView(GameModel gModel) {
        
        this.gModel = gModel;
        
        gameLabel = new JLabel("GAME VIEW");
        
        add(gameLabel);
        
    }
    
}
