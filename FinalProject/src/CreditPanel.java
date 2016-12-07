
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
        
        this.setBackground(new Color(235, 252, 244));
        
        creditText = new JLabel("<html><p style=\"text-align:center;font-size:14px\"><b>Developers:</b></p><p style=\"text-align:center;font-size:10px\"><br><br>Nathan Smith<br><br>Lauren Doutt<br><br>Zachary Ishler</p></html>");
        
        this.add(creditText, gbc);
        
    }
    
}
