
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SplashPanel extends JPanel{
    
    private JLabel splashTitle;
    private JButton backButton;
    
    SplashPanel() {
        
        splashTitle = new JLabel("Splash Menu");
        backButton = new JButton("Back"); 
        
        /*Replace backButton with a mouse click action on the panel, so that 
        when user clicks anywere on the splash screen, the main menu panel 
        is shown.*/

        add(splashTitle);
        add(backButton);
        
    }
    
    public JButton getBackButton() {

        return this.backButton;

    }
    
}
