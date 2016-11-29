
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AboutPanel extends JPanel{
    
    private JPanel aboutPane;
    private GridBagConstraints gbc;
    
    private JLabel aboutTitle;
    private JLabel goal;
    private JLabel controls;
    private JLabel instructions;
    
    AboutPanel() {
        
        aboutPane = new JPanel();
        aboutPane.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        
        aboutTitle = new JLabel("Instructions:");
        goal= new JLabel("Eat apples to get points. The more you eat the longer your tail gets.");
        controls = new JLabel("Use the arrow keys to change your direction.");
        instructions = new JLabel("Don't collide with yourself or the walls.");
        
        //Positioning, padding, alignment, etc.
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10,10,10,10);
        aboutPane.add(aboutTitle, gbc);
        
        gbc.gridy++;
        aboutPane.add(goal, gbc);
        
        gbc.gridy++;
        aboutPane.add(controls, gbc);
        
        gbc.gridy++;
        aboutPane.add(instructions, gbc);
        
        add(aboutPane);
        
    }
    
}
