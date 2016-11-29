
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.Hashtable;
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
    
    private JLabel speedLabel;
    private JSlider speedSlider;
    private JLabel appleSizeLabel;
    private JSlider appleSizeSlider;
    private JButton saveButton;
    private Hashtable<Integer, JLabel> speedLabelTable;
    private Hashtable<Integer, JLabel> sizeLabelTable;
    
    private JPanel optionPane; //for nicer formatting

    OptionView(OptionModel oModel) 
    {
        
        this.oModel = oModel;
        
        optionPane = new JPanel();
        optionPane.setLayout(new GridLayout(9, 1));
        
        optionLabel = new JLabel("Options Menu");
        
        colorLabel = new JLabel("Change Snake Color");
        color1Button = new JButton("Green");
        color2Button = new JButton("Blue");
        
        speedLabel = new JLabel("Snake Speed");
        speedSlider = new JSlider(JSlider.HORIZONTAL, 1, 3, 1);
        speedSlider.setMajorTickSpacing(1);
        speedSlider.setPaintTicks(true);
        speedSlider.setPaintLabels(true);
        speedLabelTable = new Hashtable<>();
        speedLabelTable.put(1, new JLabel("Slow"));
        speedLabelTable.put(2, new JLabel("Medium"));
        speedLabelTable.put(3, new JLabel("Fast"));
        speedSlider.setLabelTable(speedLabelTable);
        
        appleSizeLabel = new JLabel("Apple Size");
        appleSizeSlider = new JSlider(JSlider.HORIZONTAL, 15, 25, 15);
        appleSizeSlider.setMajorTickSpacing(5);
        appleSizeSlider.setPaintTicks(true);
        appleSizeSlider.setSnapToTicks(true);
        appleSizeSlider.setPaintLabels(true);
        sizeLabelTable = new Hashtable<>();
        sizeLabelTable.put(15, new JLabel("Small"));
        sizeLabelTable.put(20, new JLabel("Medium"));
        sizeLabelTable.put(25, new JLabel("Large"));
        appleSizeSlider.setLabelTable(sizeLabelTable);
        
        saveButton = new JButton("Save");
        
        optionPane.add(optionLabel);
        optionPane.add(colorLabel);
        optionPane.add(color1Button);
        optionPane.add(color2Button);
        optionPane.add(speedLabel);
        optionPane.add(speedSlider);
        optionPane.add(appleSizeLabel);
        optionPane.add(appleSizeSlider);
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
    
    public int getSpeedValue()
    {
        return speedSlider.getValue();
    }
    
    public int getAppleSize()
    {
        return appleSizeSlider.getValue();
    }
}
