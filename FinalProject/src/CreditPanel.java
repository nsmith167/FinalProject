
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CreditPanel extends JPanel{
    
    private JLabel creditTitle;
    private JButton backButton;
    
    CreditPanel() {
        
        creditTitle = new JLabel("Credit Menu");
        backButton = new JButton("Back");

        add(creditTitle);
        add(backButton);
        
    }
    
    public JButton getBackButton() {

        return this.backButton;

    }
        
}
