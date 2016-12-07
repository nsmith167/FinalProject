
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
    private ArrayList<String> scoreInfo = new ArrayList<>();
    private String displayInfo;
    
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
        this.setBackground(new Color(235, 252, 244));
          
        //the information that will be displayed on the score panel
        displayInfo = "";
        
        scorePane = new JPanel(new GridBagLayout());
        scorePane.setBackground(new Color(235, 252, 244));
        gbc = new GridBagConstraints();
        
        //Score Label
        highScoreLabel = new JLabel("<html><p style=\"text-align:center;font-size:12px\"><b>Recent Scores</b></p></html>");
        
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
        searchPane.setBackground(new Color(235, 252, 244));
        searchLabel = new JLabel("<html><p style=\"text-align:center;font-size:12px\"><b>Search by Username (case-sensitive)</b></p></html>");
        searchBoxPane = new JPanel();
        searchBoxPane.setBackground(new Color(235, 252, 244));
        
        //TextField for search term
        searchBox = new JTextField(15);
        
        //The 'Search' Button
        loadButton = new JButton("Search");
        loadButton.setBackground(new Color(176, 232, 204));
        
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
    
    public void displayScores()
    {
        scoreInfo = sModel.readInfoFromFile();
        //a for loop to go through the saved file's arraylist and saving all the data to displayinfo
        for(int i = 0; i < scoreInfo.size(); i++) {
            displayInfo = displayInfo + "\n " + scoreInfo.get(i);
        }
        fileResults.setText(displayInfo);
    }
    //methods to get loadbutton
    public JButton getLoadButton() {
         return this.loadButton;
    }
    
    //gets the text from the search box field
    public String getSearchField() {
        return this.searchBox.getText();
    }
    
    //adds button listener to load button
    public void addButtonListener(ActionListener al) { 
        loadButton.addActionListener(al);
    }
    
    //shows the search result
    public void showSearch(String search) {
        searchResult.setText(search);
    }
         
}
