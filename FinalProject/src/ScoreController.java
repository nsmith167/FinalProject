
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class ScoreController {
    
    ScoreModel sModel;
    ScoreView sView;
    
    ScoreController(ScoreModel sModel, ScoreView sView) {
        
        this.sModel = sModel;
        this.sView = sView;
     
    
    class ButtonListener implements ActionListener{
     public void actionPerformed(ActionEvent e){
         
      
        // ScoreView.setuserNames(sModel.getuserNames());
     }
 }
        //ScoreView.addButtonListener(new ButtonListener());
 
}
}
