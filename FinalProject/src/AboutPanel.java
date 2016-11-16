
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AboutPanel extends JPanel{
    
    private JLabel aboutTitle;
    private JButton backButton;
    
    AboutPanel() {
        
        aboutTitle = new JLabel("About Menu");
        backButton = new JButton("Back");

        add(aboutTitle);
        add(backButton);
        
    }
    
    public JButton getBackButton() {

        return this.backButton;

    }
    
}
