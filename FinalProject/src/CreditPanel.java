
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CreditPanel extends JPanel{
    
    private JPanel creditPane;
    private GridBagConstraints gbc;
    
    private JLabel creditTitle;
    private JLabel creditText1;
    private JLabel creditText2;
    private JLabel creditText3;
    private JLabel creditText4;
    
    CreditPanel() {
        
        this.setLayout(new BorderLayout());
        
        creditPane = new JPanel();
        creditPane.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        
        creditTitle = new JLabel("Credits");
        creditText1 = new JLabel("Developers:");
        creditText2 = new JLabel("Nathan Smith");
        creditText3 = new JLabel("Lauren Doutt");
        creditText4 = new JLabel("Zachary Ishler");
        
        //Positioning, padding, alignment, etc.
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10,10,10,10);
        creditPane.add(creditTitle, gbc);
        
        gbc.gridy++;
        creditPane.add(creditText1, gbc);
        
        gbc.gridy++;
        creditPane.add(creditText2, gbc);
        
        gbc.gridy++;
        creditPane.add(creditText3, gbc);
        
        gbc.gridy++;
        creditPane.add(creditText4, gbc);
        
        this.add(creditPane, BorderLayout.CENTER);
        
    }
    
}
