
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
        private JButton cButton;
        private JButton rThemeButton;
        private JButton gThemeButton;
        private JButton bThemeButton;
        private JButton rSnakeButton;
        private JButton gSnakeButton;
        private JButton bSnakeButton;
		
        private JSlider volumeSlider;
        
        private OptionModel o_model;
        
        OptionView(OptionModel o_model) {
            
            this.o_model = o_model;
            
            optionTitle = new JLabel("Option Menu");
            option1Label = new JLabel("Game Volume");
            option2Label = new JLabel("Theme Color");
            option3Label = new JLabel("Snake Color");
            
            backButton = new JButton("Back");
            cButton = new JButton("Credits");
            rThemeButton = new JButton("R");        //maybe add these to a smaller panel later, since they will always be grouped and probably in a grid
            gThemeButton = new JButton("G");
            bThemeButton = new JButton("B");
            rSnakeButton = new JButton("R");
            gSnakeButton = new JButton("G");
            bSnakeButton = new JButton("B");
            
            volumeSlider = new JSlider(JSlider.HORIZONTAL, VOLUME_MIN, VOLUME_MAX, VOLUME_DEFAULT);
            
            add(optionTitle);
            add(option1Label);
            add(volumeSlider);
            add(option2Label);
            add(rThemeButton);
            add(gThemeButton);
            add(bThemeButton);
            add(option3Label);
            add(rSnakeButton);
            add(gSnakeButton);
            add(bSnakeButton);
            add(backButton);
            add(cButton);
            
        }
        
        public JButton getBackButton() {

            return this.backButton;

        }
        
        public JButton getRThemeButton() {

            return this.rThemeButton;

        }
        
        public JButton getGThemeButton() {

            return this.gThemeButton;

        }
        
        public JButton getBThemeButton() {

            return this.bThemeButton;

        }
        
        public JButton getCButton() {

            return this.cButton;

        }
        
}
