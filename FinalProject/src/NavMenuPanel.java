
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NavMenuPanel extends JPanel {

    private JLabel menuTitle;
    
    //His example does not make these private so that they can be accessed elsewhere
    JButton gButton;
    JButton scButton;
    JButton oButton;
    JButton aButton;  
	
    public NavMenuPanel() {
	
        super();
		
        menuTitle = new JLabel("Navigation Menu");

		gButton = new JButton("Play");
		scButton = new JButton("High Scores");
		oButton = new JButton("Options");
		aButton = new JButton("About"); 
                                  
        add(menuTitle);
        add(gButton);
        add(scButton);
        add(oButton);
        add(aButton);		
        
    }   
    
}