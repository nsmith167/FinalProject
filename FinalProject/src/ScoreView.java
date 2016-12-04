
import java.awt.GridLayout;
import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class ScoreView extends JPanel{
    private ScoreModel sModel;
    
    //the left pane of the program
    private JPanel scorePane;
    private JLabel highScoreLabel;
    private JTextArea fileResults; 
  
    //the right pane of the program
    private JPanel searchPane;
    private JLabel searchLabel;
    private MaskFormatter searchBoxFormat;
    private JTextField searchBox;
    private JButton loadButton;
    private JTextArea searchResult;
   
    
    ScoreView(ScoreModel sModel) {
        
        this.sModel = sModel;
        this.setLayout(new GridLayout(1, 2));
        
        //arraylists to store the information from the example data
        ArrayList <String> userNames = new ArrayList<>();
        ArrayList <Integer> scores = new ArrayList <Integer> ();
        
        //arraylist to get the stored written information from the saved file
        ArrayList <String> info = new ArrayList <String> ();
        
        //getting the sample usernames and scores
        userNames=sModel.getuserNames();
        scores= sModel.getScores();
        
        //storing the sample data to the file
        sModel.saveInfotoFile(userNames, scores);
        
        //storing the information from the saved file to this arraylist
        info=sModel.readInfoFromFile();
        
 
      //the information that will be displayed on the score panel
        String displayInfo="";
        
        scorePane = new JPanel();

        //Score Label
        highScoreLabel = new JLabel("High Scores");
        
      
     //a for loop to go through the saved file's arraylist and saving all the data to displayinfo
         for(int i=0; i<info.size();i++){
            displayInfo = displayInfo+ "\n " + info.get(i);
        }
         
         //displaying the information from the written file to a textarea
         fileResults = new JTextArea(displayInfo);
         fileResults.setBackground(this.getBackground());
         fileResults.setEditable(false);
        
        //adding the score elements to the score pane
        scorePane.add(highScoreLabel);  
        scorePane.add(fileResults);

        //Search Pane
        searchPane = new JPanel();
        
        //a search label
        searchLabel = new JLabel("Search by Username:");
        
        //Textfield where the user can edit for searches
        searchBox = new JTextField("Add Username Here");
        
        //load button will load the users search
        loadButton = new JButton("Search");
        
    //the area where the search results will be displayed
        searchResult = new JTextArea();
        searchResult.setBackground(this.getBackground());
        searchResult.setEditable(false);
        
     //adding the search elements to the search pane
        searchPane.add(searchLabel);    //Will change layout later
        searchPane.add(searchBox);
        searchPane.add(loadButton);
        searchPane.add(searchResult);
        
     //adding the two panes to the program
        this.add(scorePane);
        this.add(searchPane);
        
    }
    //methods to get loadbutton, fill in searchfield, add button listener, and display the user's search
      public JButton getLoadButton(){
         return this.loadButton;
     }
    public String getSearchField(){
        return this.searchBox.getText();
    }
      public void addButtonListener(ActionListener al) 
    { 
        loadButton.addActionListener(al);
    }
         public void showSearch(String search)
    {
        searchResult.setText(search);
    }
}
