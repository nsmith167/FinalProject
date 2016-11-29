
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.util.Hashtable;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class OptionView extends JPanel{
    
    private OptionModel oModel;
    
    private JPanel optionPane;
    private GridBagConstraints gbc;
    
    private JLabel optionLabel;
    
    private JPanel colorButtonPane;
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
    
    OptionView(OptionModel oModel) 
    {
        
        this.oModel = oModel;
        
        optionPane = new JPanel();
        optionPane.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        
        optionLabel = new JLabel("Options Menu");
        
        colorButtonPane = new JPanel();
        colorLabel = new JLabel("Change Snake Color");
        color1Button = new JButton("Green");
        color2Button = new JButton("Blue");
        
        speedLabel = new JLabel("Snake Speed");
        speedSlider = new JSlider(JSlider.HORIZONTAL, 1, 3, 1);
        speedSlider.setMajorTickSpacing(1);
        speedSlider.setPaintTicks(true);
        speedSlider.setSnapToTicks(true);
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
        
        
        //Positioning, padding, alignment, etc.
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10,10,10,10);
        optionPane.add(optionLabel, gbc);
        
        gbc.gridy++;
        optionPane.add(colorLabel, gbc);
        
        gbc.gridy++;
        colorButtonPane.add(color1Button);
        colorButtonPane.add(color2Button);
        optionPane.add(colorButtonPane, gbc);
        
        gbc.gridy++;
        optionPane.add(speedLabel, gbc);
        
        gbc.gridy++;
        optionPane.add(speedSlider, gbc);
        
        gbc.gridy++;
        optionPane.add(appleSizeLabel, gbc);
        
        gbc.gridy++;
        optionPane.add(appleSizeSlider, gbc);
        
        gbc.gridy++;
        optionPane.add(saveButton, gbc);
        
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
