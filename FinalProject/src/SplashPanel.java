
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SplashPanel extends JPanel{
    
    JTextField splashTitle;
    JButton backButton;
    
    SplashPanel() {
        
        splashTitle = new JTextField("Splash Menu");
        backButton = new JButton("Back to Main Menu");

        add(splashTitle);
        add(backButton);
        
    }
    
}
