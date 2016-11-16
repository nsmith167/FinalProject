
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class OptionsView extends JPanel{
        
        JTextField optionsTitle;
        JLabel option1Label;
        JLabel option2Label;
        JLabel option3Label;
        
        JButton whiteThemeButton;
        JButton grayThemeButton;
        JButton blackThemeButton;
        JButton whiteSnakeButton;
        JButton graySnakeButton;
        JButton blackSnakeButton;
        
        JSlider volumeSlider;
        
        OptionsModel o_model;
        
        OptionsView(OptionsModel o_model) {
            
            this.o_model = o_model;
            
            whiteThemeButton = new JButton("W");;
            grayThemeButton = new JButton("G");;
            blackThemeButton = new JButton("B");;
            whiteSnakeButton = new JButton("W");;
            graySnakeButton = new JButton("G");;
            blackSnakeButton = new JButton("B");;
            
            add(optionsTitle);
            add(option1Label);
            add(whiteThemeButton);
            add(grayThemeButton);
            add(blackThemeButton);
            add(option2Label);
            add(whiteSnakeButton);
            add(graySnakeButton);
            add(blackSnakeButton);
            add(option3Label);
            add(volumeSlider);
            
        }
}
