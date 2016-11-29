
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AboutPanel extends JPanel{
    
    private JLabel aboutTitle;
    
    AboutPanel() {
        
        aboutTitle = new JLabel("Instructions:");
    
        JLabel goal= new JLabel("The Goal is to eat apples to get points.");
        JLabel controls = new JLabel("You can move up, down, left, and right by hitting the arrows.");
        JLabel instructions = new JLabel("Move the snake and eat the apples!");

        add(aboutTitle);
        
        add(goal);
        add(controls);
        add(instructions);
        
    }
    
}
