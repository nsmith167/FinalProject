
import java.awt.GridLayout;
import java.util.Hashtable;
import javax.swing.BoxLayout;
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
    private Hashtable<Integer, JLabel> labelTable;
    
    private JPanel optionPane;

    OptionView(OptionModel oModel) {
        
        this.oModel = oModel;
        
        optionPane = new JPanel();
        optionPane.setLayout(new GridLayout(6, 1));
        
        optionLabel = new JLabel("Options Menu");
        
        colorLabel = new JLabel("Change Snake Color");
        color1Button = new JButton("Color 1");
        color2Button = new JButton("Color 2");
        
        difficultyLabel = new JLabel("Difficulty");
        difficultySlider = new JSlider(JSlider.HORIZONTAL, 1, 3, 1);
        difficultySlider.setMajorTickSpacing(1);
        difficultySlider.setPaintTicks(true);
        difficultySlider.setPaintLabels(true);
        labelTable = new Hashtable<>();
        labelTable.put(1, new JLabel("Easy"));
        labelTable.put(2, new JLabel("Medium"));
        labelTable.put(3, new JLabel("Hard"));
        difficultySlider.setLabelTable(labelTable);
        
        optionPane.add(optionLabel);
        optionPane.add(colorLabel);
        optionPane.add(color1Button);
        optionPane.add(color2Button);
        optionPane.add(difficultyLabel);
        optionPane.add(difficultySlider);
        add(optionPane);
        
    }
    
}