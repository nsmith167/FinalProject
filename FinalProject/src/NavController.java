
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
    
    public NavController(NavModel n_model, NavView n_view ) {
        this.n_model = n_model;
        this.n_view = n_view;
        
        o_model = new OptionModel();        
        o_view = new OptionView(o_model);
        o_Controller = new OptionController(o_model, o_view); 
        
        m_view = new MainView();
                
        n_view.addOptionsButtonListener(new OptionsButtonListener());
        n_view.addMainButtonListener(new MainButtonListener());        
        
    }
    class OptionsButtonListener implements ActionListener {            
        public void actionPerformed(ActionEvent e)
        {            
            //Pass an Options View object to our Navigation View
            n_view.switchToOptionsPanel(o_view);
        }
    }     
 
    class MainButtonListener implements ActionListener {            
        public void actionPerformed(ActionEvent e)
        {            
            //Pass a Main View object to our Navigation View
            n_view.switchToMainPanel(m_view);
        }
        
    }         
    
    //TODO: Add listeners on buttons to switch to other Panels
    
}

