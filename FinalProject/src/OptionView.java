
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    private JButton saveButton;
    private Hashtable<Integer, JLabel> labelTable;
    
    private JPanel optionPane; //for nicer formatting

    OptionView(OptionModel oModel) 
    {
        
        this.oModel = oModel;
        
        optionPane = new JPanel();
        optionPane.setLayout(new GridLayout(7, 1));
        
        optionLabel = new JLabel("Options Menu");
        
        colorLabel = new JLabel("Change Snake Color");
        color1Button = new JButton("Green");
        color2Button = new JButton("Blue");
        
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
        
        saveButton = new JButton("Save");
        
        optionPane.add(optionLabel);
        optionPane.add(colorLabel);
        optionPane.add(color1Button);
        optionPane.add(color2Button);
        optionPane.add(difficultyLabel);
        optionPane.add(difficultySlider);
        optionPane.add(saveButton);
        add(optionPane);
        
    }
    
    public void addButtonListener(ActionListener al)
    {
        color1Button.addActionListener(al);
        color2Button.addActionListener(al);
        saveButton.addActionListener(al);
    }
    
    public JButton getColor1Button()
    {
        return color1Button;
    }
    
    public JButton getColor2Button()
    {
        return color2Button;
    }
    
    public JButton getSaveButton()
    {
        return saveButton;
    }
    
    public int getDifficultyValue()
    {
        return difficultySlider.getValue();
    }
}
