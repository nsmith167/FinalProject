
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SplashPanel extends JPanel{
    
    private JLabel splashLabel;
    private JButton splashButton;
    
    SplashPanel() {

        splashLabel = new JLabel("WELCOME TO SNAKE");
        splashButton = new JButton(new ImageIcon("src/tiny_snek.jpg"));            
        add(splashLabel);
        add(splashButton);
            
    }    
    
}