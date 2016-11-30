
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AboutPanel extends JPanel{
    
    private JPanel aboutPane;
    private GridBagConstraints gbc;
    
    private JLabel aboutText;
    
    AboutPanel() {
        
        this.setLayout(new BorderLayout());
        this.setBackground(Color.WHITE);
        
        aboutPane = new JPanel();
        aboutPane.setBackground(Color.WHITE);
        aboutPane.setLayout(new BorderLayout());
        gbc = new GridBagConstraints();
        
        aboutText = new JLabel("<html><p style=\"text-align:center;font-size:20px\"><b>Instructions:<b><br><br><br>Eat apples to get points.<br><br>The more you eat the longer your tail gets.<br><br>Use the arrow keys to change your direction.<br><br>Don't collide with yourself or the walls</p></html>");
        
        aboutPane.add(aboutText, BorderLayout.CENTER);
        
        add(aboutPane, BorderLayout.CENTER);
        
    }
    
}
