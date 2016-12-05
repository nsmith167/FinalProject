
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class ScoreView extends JPanel {
    
    private ScoreModel sModel;
    
    //Score pane (Left)
    private JPanel scorePane;
    private JLabel highScoreLabel;
    private JTextArea fileResults; 
  
    //Search pane (Right)
    private GridBagConstraints gbc;
    private JPanel searchPane;
    private JLabel searchLabel;
    private JPanel searchBoxPane;
    private MaskFormatter searchBoxFormat;
    private JTextField searchBox;
    private JButton loadButton;
    private JTextArea searchResult;
   
    
    ScoreView(ScoreModel sModel) {
        
        this.sModel = sModel;
        this.setLayout(new GridLayout(1, 2));
        this.setBackground(Color.WHITE);
        
        //arraylists to store the information from the example data
        ArrayList<String> userNames = new ArrayList<>();
        ArrayList<Integer> scores = new ArrayList<>();
        
        //arraylist to get the stored written information from the saved file
        ArrayList<String> info = new ArrayList<>();
        
        //getting the sample usernames and scores
        userNames = sModel.getuserNames();
        scores = sModel.getScores();
        
        //storing the sample data to the file
        sModel.saveInfotoFile(userNames, scores);
        
        //storing the information from the saved file to this arraylist
        info = sModel.readInfoFromFile();
        
        //the information that will be displayed on the score panel
        String displayInfo = "";
        
        scorePane = new JPanel(new GridBagLayout());
        scorePane.setBackground(Color.WHITE);
        gbc = new GridBagConstraints();
        
        //Score Label
        highScoreLabel = new JLabel("Recent Scores");
        
      
        //a for loop to go through the saved file's arraylist and saving all the data to displayinfo
        for(int i = 0; i < info.size(); i++) {
            displayInfo = displayInfo + "\n " + info.get(i);
        }
         
        //displaying the information from the written file to a textarea
         fileResults = new JTextArea(displayInfo);
         fileResults.setBackground(this.getBackground());
         fileResults.setEditable(false);
        
        //Add to score pane
        gbc.gridx = 0;
        gbc.gridy = 0;
        scorePane.add(highScoreLabel, gbc); 
        
        gbc.gridy++;
        scorePane.add(fileResults, gbc);

        //Search Pane
        searchPane = new JPanel(new GridBagLayout());
        searchPane.setBackground(Color.WHITE);
        searchLabel = new JLabel("Search by Username(case-sensitive)");
        searchBoxPane = new JPanel();
        searchBoxPane.setBackground(Color.WHITE);
        
        //TextField for search term
        searchBox = new JTextField("Add Username Here", 10);
        
        //The 'Search' Button
        loadButton = new JButton("Search");
        
        //Displays search results
        searchResult = new JTextArea();
        searchResult.setBackground(this.getBackground());
        searchResult.setEditable(false);
        
        //Add to search pane
        gbc.gridx = 0;
        gbc.gridy = 0;
        searchPane.add(searchLabel, gbc);
        
        gbc.gridy++;
        searchPane.add(searchBoxPane, gbc);
        searchBoxPane.add(searchBox);
        searchBoxPane.add(loadButton);
        
        gbc.gridy++;
        searchPane.add(searchResult, gbc);
        
        //Add both panes
        this.add(scorePane);
        this.add(searchPane);
        
    }
    
    //methods to get loadbutton, fill in searchfield, add button listener, and display the user's search
    public JButton getLoadButton() {
         return this.loadButton;
    }
    public String getSearchField() {
        return this.searchBox.getText();
    }
    public void addButtonListener(ActionListener al) { 
        loadButton.addActionListener(al);
    }
    public void showSearch(String search) {
        searchResult.setText(search);
    }
         
}
