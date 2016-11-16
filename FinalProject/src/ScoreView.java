
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ScoreView extends JPanel{
    
    JTextField scoreTitle;
    JButton backButton;
    
    ScoreModel s_model;
    
    ScoreView(ScoreModel s_model) {
        
        this.s_model = s_model;
        
        scoreTitle = new JTextField("Score Menu");
        backButton = new JButton("Back to Main Menu");

        add(scoreTitle);
        add(backButton);
        
    }
    
    
}
