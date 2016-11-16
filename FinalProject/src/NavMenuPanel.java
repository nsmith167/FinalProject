
import javax.swing.JButton;
import javax.swing.JPanel;

public class NavMenuPanel extends JPanel{
    JButton mainButton;
    JButton optionsButton;
    JButton aboutButton;
    JButton creditsButton;  
    public NavMenuPanel() {
        super();       
        mainButton = new JButton("Main");
        optionsButton = new JButton("Options");
        aboutButton = new JButton("About");
        creditsButton = new JButton("Credits");
                                  
        add(mainButton);
        add(optionsButton);
        add(aboutButton);
        add(creditsButton);   
        
    }   
    
}