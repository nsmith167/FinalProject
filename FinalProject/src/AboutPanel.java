
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AboutPanel extends JPanel{
    
    private final GridBagConstraints gbc;
    private final JLabel aboutText;
    
    AboutPanel() {
        
        this.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        this.setBackground(Color.WHITE);
        
        aboutText = new JLabel("<html><p style=\"text-align:center\"><b>Instructions:<b><br><br><br>Eat apples to get points.<br><br>The more you eat the longer your tail gets.<br><br>Use the arrow keys to change your direction.<br><br>Don't collide with yourself or the walls</p></html>");
        
        this.add(aboutText, gbc);
        
    }
    
}
