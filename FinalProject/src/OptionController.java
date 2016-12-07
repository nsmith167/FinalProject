
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class OptionController {
    
    private OptionModel oModel;
    private OptionView oView;
    
    OptionController(OptionModel oModel, OptionView oView) {
        
        this.oModel = oModel;
        this.oView = oView;
        
        class ButtonListener implements ActionListener {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                JButton eventButton = (JButton)ae.getSource();
                
                if(eventButton == oView.getColor1Button()) {            //Green Button Source
                    
                    oModel.setSnakeColor(new Color(102, 222, 128));
                    
                } else if(eventButton == oView.getColor2Button()) {     //Blue Button Source
                    
                    oModel.setSnakeColor(new Color(102, 200, 222));
                    
                } else if(eventButton == oView.getSaveButton()) {       //Save Button Source
                    
                    oModel.setSnakeSpeed(oView.getSpeedValue());
                    oModel.setAppleSize(oView.getAppleSize());
                    
                }
                
            }
            
        }
        
        oView.addButtonListener(new ButtonListener());
        
    }
    
}
