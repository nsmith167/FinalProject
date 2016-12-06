
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class NavViewPanel extends JPanel{
    
    NavMenuPanel menu;
    SplashPanel splash;
    
    GameView gView;
    ScoreView sView;
    OptionView oView;
    AboutPanel aPanel;
    CreditPanel cPanel;
    
    public NavViewPanel() {
        
        super();
        setLayout(new BorderLayout());     
        menu = new NavMenuPanel();
        splash = new SplashPanel();
        
        add(menu, BorderLayout.SOUTH);        
        add(splash, BorderLayout.CENTER); 
    }
    
    //Note: Splash screen is only shown on startup.  No need to navigate back to it.
    
    public void addSplash(NavView nView) {
        add(nView, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    public void addGame(GameView gView) {
        this.gView = gView;  //maintain handle to this view so we can remove it
        add(gView, BorderLayout.CENTER);
        revalidate();
        repaint();
        gView.requestFocus();
    }    
    
    public void addScore(ScoreView sView) {
        this.sView = sView; //maintain handle to this view so we can remove it
        add(sView, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    public void addOption(OptionView oView) {
        this.oView = oView; //maintain handle to this view so we can remove it
        add(oView, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    public void addAbout(AboutPanel aPanel) {
        this.aPanel = aPanel; //maintain handle to this view so we can remove it
        add(aPanel, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    public void addCredit(CreditPanel cPanel) {
        this.cPanel = cPanel; //maintain handle to this view so we can remove it
        add(cPanel, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    public void removeSplash() {
        remove(splash);
    }

    public void removeGame() {
        if (this.gView != null) {
            remove(this.gView);
        }
    }
    
    public void removeScore() {
        if (this.sView != null) {
            remove(this.sView);
        }
    }
    
    public void removeOption() {
        if (this.oView != null) {
            remove(this.oView);
        }
    }
    
    public void removeAbout() {
        if (this.aPanel != null) {
            remove(this.aPanel);
        }
    }
    
    public void removeCredit() {
        if (this.cPanel != null) {
            remove(this.cPanel);
        }
    }
        
}