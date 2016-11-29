
import java.awt.GridLayout;
import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class ScoreView extends JPanel{
    
    private ScoreModel sModel;
    
    private JPanel scorePane;
    private JPanel searchPane;
    
    private JLabel scoreTitle;
    
    private JLabel highScoreLabel;
    private JTextArea highScoreList;
    
    private JLabel searchLabel;
    private MaskFormatter searchBoxFormat;
    private JFormattedTextField searchBox;
    private JTextArea searchResult;
    
    ScoreView(ScoreModel sModel) {
        
        this.sModel = sModel;
        
        setLayout(new GridLayout(1, 2));
        
        scorePane = new JPanel();   //Will change layout of both panes later
        searchPane = new JPanel();
        
        scoreTitle = new JLabel("Score Menu");
        
        highScoreLabel = new JLabel("High Scores");
        highScoreList = new JTextArea("XYZ\t1000");
        highScoreList.setBackground(this.getBackground());
        highScoreList.setEditable(false);
        scorePane.add(highScoreLabel);
        scorePane.add(highScoreList);
        
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
        searchPane.add(searchLabel);
        searchPane.add(searchBox);
        searchPane.add(searchResult);
        
        add(scorePane);
        add(searchPane);
        
    }
    
}
