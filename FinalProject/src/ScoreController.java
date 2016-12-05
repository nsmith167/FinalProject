
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;


public class ScoreController {
    //variables
    ScoreModel sModel;
    ScoreView sView;
    ArrayList <String> infoRead = new ArrayList <String> ();
    
    ScoreController(ScoreModel sModel, ScoreView sView) {
           this.sModel = sModel;
           this.sView = sView;
        
     class ButtonListener implements ActionListener {            
      public void actionPerformed(ActionEvent e)
      {
          //checking to see if the clicked button is the load button
            JButton clickSource = (JButton)e.getSource();
            if(clickSource== sView.getLoadButton()){
                  
                //getting the variable the user just entered in the search box
                     String matchToLookFor = sView.getSearchField();
                     
                //this arraylist takes the information from the saved file
                  infoRead=sModel.readInfoFromFile();
                 
                  //this variable is going to store the result of the search
                  String result="";
                    
                  
        //for loop that goes through the arraylist from the written file 
        //checks for the arraylist containing the search word the user entered into the search box
                   for(int i=0; i<infoRead.size(); i++){
                    if(infoRead.get(i).contains(matchToLookFor)){
                        result=infoRead.get(i);
                       break;
                    }
                    else{result= "no match";}
                   }
                  
                  //the result displayed to user 
                 sView.showSearch(result);
                  
                    
      }else{}
     }}
            //calling button listener from sView
              sView.addButtonListener(new ButtonListener());   
        }      
    }

