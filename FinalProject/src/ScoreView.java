
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ScoreView extends JPanel{
    
    ScoreModel sModel;
    
    JLabel scoreLabel;
    
    ScoreView(ScoreModel sModel) {
        
        this.sModel = sModel;
        
        scoreLabel = new JLabel("SCORES");
        
        add(scoreLabel);
        
    }
    
}
