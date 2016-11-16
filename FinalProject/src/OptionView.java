
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class OptionView extends JPanel{
        
        private final int VOLUME_MIN = 0;
        private final int VOLUME_MAX = 100;
        private final int VOLUME_DEFAULT = 50;
		
        private JLabel optionTitle;
        private JLabel option1Label;
        private JLabel option2Label;
        private JLabel option3Label;
		
        private JButton backButton;
        private JButton whiteThemeButton;
        private JButton grayThemeButton;
        private JButton blackThemeButton;
        private JButton whiteSnakeButton;
        private JButton graySnakeButton;
        private JButton blackSnakeButton;
		
        private JSlider volumeSlider;
        
        private OptionModel o_model;
        
        OptionView(OptionModel o_model) {
            
            this.o_model = o_model;
            
            optionTitle = new JLabel("Option Menu");
            option1Label = new JLabel("Game Volume");
            option2Label = new JLabel("Theme Color");
            option3Label = new JLabel("Snake Color");
            
            backButton = new JButton("Back");
            whiteThemeButton = new JButton("W");
            grayThemeButton = new JButton("G");
            blackThemeButton = new JButton("B");
            whiteSnakeButton = new JButton("W");
            graySnakeButton = new JButton("G");
            blackSnakeButton = new JButton("B");
            
            volumeSlider = new JSlider(JSlider.HORIZONTAL, VOLUME_MIN, VOLUME_MAX, VOLUME_DEFAULT);
            
            add(optionTitle);
            add(option1Label);
            add(volumeSlider);
            add(option2Label);
            add(whiteThemeButton);
            add(grayThemeButton);
            add(blackThemeButton);
            add(option3Label);
            add(whiteSnakeButton);
            add(graySnakeButton);
            add(blackSnakeButton);
            add(backButton);
            
        }
        
        public JButton getBackButton() {

            return this.backButton;

        }
        
        public JButton getWhiteThemeButton() {

            return this.whiteThemeButton;

        }
        
        public JButton getGrayThemeButton() {

            return this.grayThemeButton;

        }
        
        public JButton getBlackThemeButton() {

            return this.blackThemeButton;

        }
        
}
