
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CreditPanel extends JPanel{
    
    private final GridBagConstraints gbc;
    private final JLabel creditText;
    
    CreditPanel() {
        
        this.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        this.setBackground(Color.WHITE);
        
        creditText = new JLabel("<html><p style=\"text-align:center\"><b>Developers:<b><br><br><br>Nathan Smith<br><br>Lauren Doutt<br><br>Zachary Ishler<br><br></p></html>");
        
        this.add(creditText, gbc);
        
    }
    
}
