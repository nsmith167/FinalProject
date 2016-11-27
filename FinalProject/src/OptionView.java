
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OptionView extends JPanel{
    
    OptionModel oModel;
    
    JLabel optionLabel;

    OptionView(OptionModel oModel) {
        
        this.oModel = oModel;

        optionLabel = new JLabel("OPTIONS");
        
        add(optionLabel);

        // It may be useful to have a Save & Return button

        //retButton = new JButton("Save and Return");

        //add(retButton);  
        
    }
    
}