
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ScoreView extends JPanel {
    
    private JTextArea scoreArea;
    private JTextArea resultArea;

    private JLabel scoreTitle;
    private JLabel searchTitle;
    private JLabel columnTitle;

    private JTextField searchField;

    private JButton backButton;
    
    private ScoreModel s_model;
    
    ScoreView(ScoreModel s_model) {
        
        this.s_model = s_model;
        
        scoreArea = new JTextArea("Scores go here");
	resultArea = new JTextArea("Search results go here");
        
	scoreTitle = new JLabel("High Score Menu");
	searchTitle = new JLabel("Search:");
	columnTitle = new JLabel("High Scores");
        
	searchField = new JTextField("");
        
        backButton = new JButton("Back");

	add(scoreTitle);
	add(columnTitle);
	add(scoreArea);
	add(searchTitle);
	add(searchField);
	add(resultArea);
	add(backButton);
        
    }
    
    public JButton getBackButton() {

        return this.backButton;

    }
    
}
