
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
    
    private JPanel scorePane;
    private JLabel highScoreLabel;
    private JTextArea fileResults; 
  
    
    private JPanel searchPane;
    private JLabel searchLabel;
    private MaskFormatter searchBoxFormat;
    private JFormattedTextField searchBox;
    private JTextArea searchResult;
   
    
    ScoreView(ScoreModel sModel) {
        
        this.sModel = sModel;
        this.setLayout(new GridLayout(1, 2));
        
        ArrayList <String> userNames = new ArrayList<>();
        ArrayList <Integer> scores = new ArrayList <Integer> ();
        ArrayList <String> info = new ArrayList <String> ();
        
        userNames=sModel.getuserNames();
        scores= sModel.getScores();
        info=sModel.readInfoFromFile();
        
        sModel.saveInfotoFile(userNames, scores);
        
      
        String displayInfo="";
        
        scorePane = new JPanel();

        highScoreLabel = new JLabel("High Scores");
        
      
     
         for(int i=0; i<info.size();i++){
            displayInfo = displayInfo+ "\n " + info.get(i);
        }
         fileResults = new JTextArea(displayInfo);
         fileResults.setBackground(this.getBackground());
         fileResults.setEditable(false);
        
        
        
        
        scorePane.add(highScoreLabel);  
        scorePane.add(fileResults);
        
        
     
      
        
        //Search
        searchPane = new JPanel();
        
        searchLabel = new JLabel("Search:");
        
        try {
            searchBoxFormat = new MaskFormatter("***");
        } catch(ParseException pe) {
            System.out.println("ERR: ParseException");
        }
        searchBoxFormat.setValidCharacters("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        
        searchBox = new JFormattedTextField(searchBoxFormat);
        searchBox.setColumns(3);
        searchBox.setHorizontalAlignment(JTextField.CENTER);
        
        searchResult = new JTextArea("XYZ\t1000");
        searchResult.setBackground(this.getBackground());
        searchResult.setEditable(false);
        
     
        searchPane.add(searchLabel);    //Will change layout later
        searchPane.add(searchBox);
        searchPane.add(searchResult);
        
        this.add(scorePane);
        this.add(searchPane);
        
    }   
    
}
