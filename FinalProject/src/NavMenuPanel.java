
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;

public class NavMenuPanel extends JPanel {

    Dimension menuButtonDimension;
    
    JButton gameButton;
    JButton scoreButton;
    JButton optionButton;
    JButton aboutButton;
    JButton creditButton; 
    
    private ArrayList<JButton> buttons;
	
    public NavMenuPanel() {
	
        super();
        
        menuButtonDimension = new Dimension(150, 25);
        
        gameButton = new JButton("Game");
        scoreButton = new JButton("Scores");
        optionButton = new JButton("Options");
        aboutButton = new JButton("Instructions");
        creditButton = new JButton("Credits");
        
        buttons = new ArrayList<>();
        buttons.add(gameButton);
        buttons.add(scoreButton);
        buttons.add(optionButton);
        buttons.add(aboutButton);
        buttons.add(creditButton);
        
        applyButtonChanges();
                   
        this.add(gameButton);
        this.add(scoreButton);
        this.add(optionButton);
        this.add(aboutButton);
        this.add(creditButton);		
        
    }   
    
    //Method made for easier changes to all buttons
    private void applyButtonChanges() {
        for(int i = 0; i < buttons.size(); i++) {
            buttons.get(i).setPreferredSize(menuButtonDimension);
        }
    }
    
}