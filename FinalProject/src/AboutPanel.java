
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AboutPanel extends JPanel{
    
    JTextField aboutTitle;
    JButton backButton;
    
    AboutPanel() {
        
        aboutTitle = new JTextField("About Menu");
        backButton = new JButton("Back to Main Menu");

        add(aboutTitle);
        add(backButton);
        
    }
    
}
