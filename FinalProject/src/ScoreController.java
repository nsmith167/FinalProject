
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;


public class ScoreController {
    
    ScoreModel sModel;
    ScoreView sView;
    ArrayList <String> infoReadFromFile = new ArrayList <String> ();
    
    ScoreController(ScoreModel sModel, ScoreView sView) {
           this.sModel = sModel;
           this.sView = sView;
        
     class ButtonListener implements ActionListener {            
      public void actionPerformed(ActionEvent e)
      {
          
            JButton clickSource = (JButton)e.getSource();
            if(clickSource== sView.getLoadButton()){
                    
                        infoReadFromFile = sModel.readInfoFromFile();
                    
                     String matchToLookFor = sView.getSearchField();
        
                     for(int i=0; i<infoReadFromFile.size(); i++){
            
                    if (matchToLookFor.equals(infoReadFromFile.get(i))){
                    sView.showSearch( infoReadFromFile.get(i));
                    break; 
                    }
                    else{
                       sView.showSearch("No match");
                    }
                    }
                
               
                   
            }else{}
                    
      }
     }
              sView.addButtonListener(new ButtonListener());   
        }      
    }

