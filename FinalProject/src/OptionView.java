
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class OptionView extends JPanel{
    
    private OptionModel oModel;
    
    private JLabel optionLabel;
    private JLabel colorLabel;
    private JButton color1Button;
    private JButton color2Button;
    private JLabel difficultyLabel;
    private JSlider difficultySlider;

    OptionView(OptionModel oModel) {
        
        this.oModel = oModel;
        optionLabel = new JLabel("Options Menu");
        colorLabel = new JLabel("Change Snake Color");
        color1Button = new JButton("Color 1");
        color2Button = new JButton("Color 2");
        difficultyLabel = new JLabel("Difficulty");
        difficultySlider = new JSlider(JSlider.HORIZONTAL, 1, 3, 1);
        difficultySlider.setMajorTickSpacing(1);
        difficultySlider.setPaintTicks(true);
        
        add(optionLabel);
        add(colorLabel);
        add(color1Button);
        add(color2Button);
        add(difficultyLabel);
        add(difficultySlider);
        
    }
    
}