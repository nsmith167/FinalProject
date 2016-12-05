
import java.awt.BorderLayout;
import java.awt.Color;
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
    
    private JLabel colorLabel;
    private JPanel colorButtonPane;
    private JButton color1Button;
    private JButton color2Button;
    
    private JLabel speedLabel;
    private JSlider speedSlider;
    private Hashtable<Integer, JLabel> speedTable;
    
    private JLabel appleSizeLabel;
    private JSlider appleSizeSlider;
    private Hashtable<Integer, JLabel> appleSizeTable;
    
    private JButton saveButton;
    
    OptionView(OptionModel oModel) 
    {
        
        this.oModel = oModel;
        this.setLayout(new BorderLayout());
        this.setBackground(Color.WHITE);
        
        optionPane = new JPanel();
        optionPane.setLayout(new GridBagLayout());
        optionPane.setBackground(Color.WHITE);
        gbc = new GridBagConstraints();
        
        optionLabel = new JLabel("Options");
        
        //Color Option
        colorLabel = new JLabel("Change Snake Color");
        colorButtonPane = new JPanel();
        colorButtonPane.setBackground(Color.WHITE);
        color1Button = new JButton("Green");
        color2Button = new JButton("Blue");
        colorButtonPane.add(color1Button);
        colorButtonPane.add(color2Button);
        
        //Snake Speed Option
        speedLabel = new JLabel("Snake Speed");
        
        speedSlider = new JSlider(JSlider.HORIZONTAL, 1, 3, 1);
        speedSlider.setBackground(Color.WHITE);
        speedSlider.setMajorTickSpacing(1);
        speedSlider.setPaintTicks(true);
        speedSlider.setSnapToTicks(true);
        speedSlider.setPaintLabels(true);
        
        speedTable = new Hashtable<>();
        speedTable.put(1, new JLabel("Slow"));
        speedTable.put(2, new JLabel("Medium"));
        speedTable.put(3, new JLabel("Fast"));
        
        speedSlider.setLabelTable(speedTable);
        
        //Apple Size Option
        appleSizeLabel = new JLabel("Apple Size");
        
        appleSizeSlider = new JSlider(JSlider.HORIZONTAL, 15, 25, 15);
        appleSizeSlider.setBackground(Color.WHITE);
        appleSizeSlider.setMajorTickSpacing(5);
        appleSizeSlider.setPaintTicks(true);
        appleSizeSlider.setSnapToTicks(true);
        appleSizeSlider.setPaintLabels(true);
        
        appleSizeTable = new Hashtable<>();
        appleSizeTable.put(15, new JLabel("Small"));
        appleSizeTable.put(20, new JLabel("Medium"));
        appleSizeTable.put(25, new JLabel("Large"));
        
        appleSizeSlider.setLabelTable(appleSizeTable);
        
        saveButton = new JButton("Save");
        
        //Positioning, padding, alignment, etc.
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10,10,10,10);
        optionPane.add(optionLabel, gbc);
        
        gbc.gridy++;
        optionPane.add(colorLabel, gbc);
        
        gbc.gridy++;
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
        
        this.add(optionPane, BorderLayout.CENTER);
        
    }
    
    public void addButtonListener(ActionListener al) {
        color1Button.addActionListener(al);
        color2Button.addActionListener(al);
        saveButton.addActionListener(al);
    }
    
    public JButton getColor1Button() {
        return color1Button;
    }
    
    public JButton getColor2Button() {
        return color2Button;
    }
    
    public JButton getSaveButton() {
        return saveButton;
    }
    
    public int getSpeedValue() {
        return speedSlider.getValue();
    }
    
    public int getAppleSize() {
        return appleSizeSlider.getValue();
    }
}
