
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class NavView extends JFrame{
    
    private NavModel nModel;
    private NavViewPanel nvPanel;
    
    NavView(NavModel nModel) {
        
        super("Snake Game");
        
        this.nModel = nModel;
        this.setSize(775, 625);
        this.setResizable(false); //user can't change frame size
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nvPanel = new NavViewPanel();
        
        this.add(nvPanel);
        
    }
    
    public void switchToGamePanel(GameView gView) {
        nvPanel.removeSplash();
        nvPanel.removeScore();
        nvPanel.removeOption();
        nvPanel.removeAbout();
        nvPanel.removeCredit();
        nvPanel.addGame(gView); 
    }
    
    public void switchToScorePanel(ScoreView sView) {
        nvPanel.removeSplash();
        nvPanel.removeGame();
        nvPanel.removeOption();
        nvPanel.removeAbout();
        nvPanel.removeCredit();
        nvPanel.addScore(sView);        
    }
    
    public void switchToOptionPanel(OptionView oView) {
        nvPanel.removeSplash();
        nvPanel.removeGame();
        nvPanel.removeScore();
        nvPanel.removeAbout();
        nvPanel.removeCredit();
        nvPanel.addOption(oView);        
    }
    
    public void switchToAboutPanel(AboutPanel aPanel) {
        nvPanel.removeSplash();
        nvPanel.removeGame();
        nvPanel.removeScore();
        nvPanel.removeOption();
        nvPanel.removeCredit();
        nvPanel.addAbout(aPanel);        
    }
    
    public void switchToCreditPanel(CreditPanel cPanel) {
        nvPanel.removeSplash();
        nvPanel.removeGame();
        nvPanel.removeScore();
        nvPanel.removeOption();
        nvPanel.removeAbout();
        nvPanel.addCredit(cPanel);        
    }
    
    public void addGameButtonListener(ActionListener al) {    
        nvPanel.menu.gameButton.addActionListener(al);
    } 
    
    public void addScoreButtonListener(ActionListener al) {    
        nvPanel.menu.scoreButton.addActionListener(al);
    }
    
    public void addOptionButtonListener(ActionListener al) {    
        nvPanel.menu.optionButton.addActionListener(al);
    }    
                    
    public void addAboutButtonListener(ActionListener al) {    
        nvPanel.menu.aboutButton.addActionListener(al);
    }      
    
    public void addCreditButtonListener(ActionListener al) {    
        nvPanel.menu.creditButton.addActionListener(al);
    }
    
}