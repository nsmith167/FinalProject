
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SplashPanel extends JPanel{
    
    private JLabel splashLabel;
    
    private ImageIcon splashIcon;
    private Image splashImage;
    private Image splashNewImage;
    
    private JLabel splashImgLabel;
    
    SplashPanel() {

        this.setBackground(Color.WHITE);
        
        splashLabel = new JLabel("Welcome to the Snake Game");  //Maybe put this in the picture later on to make it look better
        
        splashIcon = new ImageIcon("src/tiny_snek.jpg");
        splashImage = splashIcon.getImage();
        splashNewImage = splashImage.getScaledInstance(780, 780,  java.awt.Image.SCALE_SMOOTH);
        splashIcon = new ImageIcon(splashNewImage);
        
        splashImgLabel = new JLabel(splashIcon);
        
        add(splashLabel);
        add(splashImgLabel);
            
    }    
    
}