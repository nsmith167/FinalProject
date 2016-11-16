
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreditPanel extends JPanel{
    
    JTextField creditTitle;
    JButton backButton;
    
    CreditPanel() {
        
        creditTitle = new JTextField("Credit Menu");
        backButton = new JButton("Back to Main Menu");

        add(creditTitle);
        add(backButton);
        
    }
    
}
