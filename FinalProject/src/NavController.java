
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NavController {
    
    NavModel n_model;
    NavView n_view;
    
    //Instance Variables for Options Model, View, and Controller
    OptionModel o_model;
    OptionView o_view;
    OptionController o_Controller;  
           
    // TODO: Create instances of your MainModel and MainController once you implement them
    MainView m_view;
    
    //Instance Variables for Scores Model, View, and Controller
    ScoreView s_view;
    ScoreModel s_model;
    
    //Instance Variable for About Panel
    AboutPanel a_panel;
    
    public NavController(NavModel n_model, NavView n_view ) {
        this.n_model = n_model;
        this.n_view = n_view;
        
        o_model = new OptionModel();        
        o_view = new OptionView(o_model);
        o_Controller = new OptionController(o_model, o_view); 
        
        m_view = new MainView();
        
        s_model = new ScoreModel();
        s_view = new ScoreView(s_model);
        
        a_panel = new AboutPanel();
                
        n_view.addOptionsButtonListener(new OptionsButtonListener());
        n_view.addGameButtonListener(new GameButtonListener()); 
        n_view.addHighScoresButtonListener(new HighScoresButtonListener());
        n_view.addAboutButtonListener(new AboutButtonListener());
        
    }
    class OptionsButtonListener implements ActionListener {            
        public void actionPerformed(ActionEvent e)
        {            
            //Pass an Options View object to our Navigation View
            n_view.switchToOptionsPanel(o_view);
        }
    }     
 
    class GameButtonListener implements ActionListener {            
        public void actionPerformed(ActionEvent e)
        {            
            //Pass a Main View object to our Navigation View
            n_view.switchToGamePanel(m_view);
        }
        
    }
    
    class HighScoresButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e)
        {
            //Pass a Score View object to our Navigation View
            n_view.switchToHighScoresPanel(s_view);
        }
    }
    
    class AboutButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e)
        {
            //Pass an About Panel object to our Navication View
            n_view.switchToAboutPanel(a_panel);
        }
    }
    
}

