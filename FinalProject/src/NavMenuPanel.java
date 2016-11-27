
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NavMenuPanel extends JPanel {

    //His example does not make these private so that they can be accessed elsewhere
    JButton gameButton;
    JButton scoreButton;
    JButton optionButton;
    JButton aboutButton;
    JButton creditButton; 
	
    public NavMenuPanel() {
	
        super();
        gameButton = new JButton("Game");
        scoreButton = new JButton("Scores");
        optionButton = new JButton("Options");
        aboutButton = new JButton("Instructions");
        creditButton = new JButton("Credits");
                                  
        add(gameButton);
        add(scoreButton);
        add(optionButton);
        add(aboutButton);
        add(creditButton);		
        
    }   
    
}