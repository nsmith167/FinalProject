
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/*
 *
 *  The Nav View exposes methods to the Nav Controller that allow it to switch panels
 * 
 */
public class NavView extends JFrame{
    
    NavModel model;
    NavViewPanel nVpanel;
    
    NavView(NavModel model)
    {
        super("Primary View");
        this.model = model;
                          
        setSize(700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        nVpanel = new NavViewPanel();
        
        add(nVpanel);    
    }
    
    public void switchToOptionsPanel(OptionView o_view)
    {
        nVpanel.removeSplash();
        nVpanel.removeGame();
        nVpanel.removeHighScores();
        nVpanel.removeAbout();
        nVpanel.addOptions(o_view);        
    }
    
    public void switchToGamePanel(MainView m_view)
    {
        nVpanel.removeSplash();
        nVpanel.removeOptions();
        nVpanel.removeHighScores();
        nVpanel.removeAbout();
        nVpanel.addGame(m_view);        
    }
    
    public void switchToHighScoresPanel(ScoreView s_view)
    {
        nVpanel.removeSplash();
        nVpanel.removeOptions();
        nVpanel.removeGame();
        nVpanel.removeAbout();
        nVpanel.addHighScores(s_view);
    }
    
    public void switchToAboutPanel(AboutPanel a_panel)
    {
        nVpanel.removeSplash();
        nVpanel.removeOptions();
        nVpanel.removeGame();
        nVpanel.removeHighScores();
        nVpanel.addAbout(a_panel);
    }
    
    public void addOptionsButtonListener(ActionListener al) 
    {    
        nVpanel.menu.oButton.addActionListener(al);
    }    
                    
    public void addGameButtonListener(ActionListener al) 
    {    
        nVpanel.menu.gButton.addActionListener(al);
    }       
    
    public void addAboutButtonListener(ActionListener al)
    {
        nVpanel.menu.aButton.addActionListener(al);
    }
    
    public void addHighScoresButtonListener(ActionListener al)
    {
        nVpanel.menu.scButton.addActionListener(al);
    }
    
    
}
