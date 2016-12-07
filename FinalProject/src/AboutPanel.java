
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
        
        this.setBackground(new Color(235, 252, 244));
        
        aboutText = new JLabel("<html><p style=\"text-align:center;font-size:14px\"><b>Instructions:</b></p><p style=\"text-align:center;font-size:10px\"><br><br>Eat apples to get points.<br><br>The more you eat the longer your tail gets.<br><br>Use the arrow keys to change your direction.<br><br>Don't collide with yourself or the walls.<br><br>Restart the program to restart the game.</p></html>");
        
        this.add(aboutText, gbc);
        
    }
    
}
