
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class NavViewPanel extends JPanel{

    NavMenuPanel menu;
    SplashPanel splash;
    
    OptionView o_view;
    MainView m_view;
    AboutPanel a_panel;
    ScoreView s_view;
    
    public NavViewPanel() {
        super();
        setLayout(new BorderLayout());     
        menu = new NavMenuPanel();
        splash = new SplashPanel();
        
        add(menu, BorderLayout.SOUTH);        
        add(splash, BorderLayout.CENTER);                        
    }
    
    //Note: Splash scrren is only shown on startup.  No need to navigate back to it.
    
    
    public void addOptions(OptionView o_view)
    {
        this.o_view = o_view; //maintain handle to this view so we can remove it
        add(o_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    public void addGame(MainView m_view)
    {
        this.m_view = m_view;  //maintain handle to this view so we can remove it
        add(m_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }    
    
    public void addSplash(NavView n_view)
    {
        add(n_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    public void addHighScores(ScoreView s_view)
    {
        this.s_view = s_view; //maintain handle
        add(s_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    public void addAbout(AboutPanel a_panel)
    {
        this.a_panel = a_panel; //maintain handle
        add(a_panel, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    
    public void removeOptions()
    {
        if (this.o_view != null)
            remove(this.o_view);
    }
    
    public void removeGame()
    {
        if (this.m_view != null)
            remove(this.m_view);
    }    
    
    public void removeSplash()
    {
        remove(splash);
    }
    
   public void removeHighScores()
   {
       if(this.s_view != null)
           remove(this.s_view);
   }
   
   public void removeAbout()
   {
       if(this.a_panel != null)
           remove(this.a_panel);
   }
}
