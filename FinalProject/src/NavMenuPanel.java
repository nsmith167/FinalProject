
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Nathan
 */
public class NavMenuPanel extends JPanel{
    JButton mainButton;
    JButton optionsButton;
    JButton instructionsButton;
    JButton creditsButton;  
    public NavMenuPanel() {
        super();       
        mainButton = new JButton("Main");
        optionsButton = new JButton("Options");
        instructionsButton = new JButton("Instructions");
        creditsButton = new JButton("Credits");
                                  
        add(mainButton);
        add(optionsButton);
        add(instructionsButton);
        add(creditsButton);   
        

    }          
}