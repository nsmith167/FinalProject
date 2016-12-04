
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class ScoreController {
    
    ScoreModel sModel;
    ScoreView sView;
    ArrayList <String> infoReadFromFile = new ArrayList <String> ();
    
    ScoreController(ScoreModel sModel, ScoreView sView) {
       
        infoReadFromFile = sModel.readInfoFromFile();
        
        String matchToLookFor = sView.getSearchField();
        
        for(int i=0; i<infoReadFromFile.size(); i++){
            
        if (matchToLookFor.equals(infoReadFromFile.get(i))){
            sView.showSearch( infoReadFromFile.get(i));
           break; 
        }
        else{}
    }
                
          
}
}
