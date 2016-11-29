
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NavController {
    
    private NavModel nModel;
    private NavView nView;
    
    private GameModel gModel;
    private GameView gView;
    private GameController gController; 
    
    private ScoreModel sModel;
    private ScoreView sView;
    private ScoreController sController; 
    
    private OptionModel oModel;
    private OptionView oView;
    private OptionController oController; 
    
    private AboutPanel aPanel;
    
    private CreditPanel cPanel;
    
    public NavController(NavModel nModel, NavView nView) {
        
        this.nModel = nModel;
        this.nView = nView;
        
        gModel = new GameModel();
        gView = new GameView(gModel);
        gController = new GameController(gModel, gView);
        
        sModel = new ScoreModel();        
        sView = new ScoreView(sModel);
        sController = new ScoreController(sModel, sView); 
        
        oModel = new OptionModel();        
        oView = new OptionView(oModel);
        oController = new OptionController(oModel, oView); 
        
        aPanel = new AboutPanel();
        
        cPanel = new CreditPanel();
        
        nView.addGameButtonListener(new GameButtonListener());
        nView.addScoreButtonListener(new ScoreButtonListener());
        nView.addOptionButtonListener(new OptionButtonListener());
        nView.addAboutButtonListener(new AboutButtonListener());
        nView.addCreditButtonListener(new CreditButtonListener());
        
    }
    
    class GameButtonListener implements ActionListener {            
        public void actionPerformed(ActionEvent e)
        {            
            //Pass a Main View object to our Navigation View
            nView.switchToGamePanel(gView);
            //Pass data from Options to Game View
            gView.setLabels(oModel.getSnakeColor(), oModel.getSnakeSpeed(), oModel.getAppleSize());
        }
    }
    
    class ScoreButtonListener implements ActionListener {            
        public void actionPerformed(ActionEvent e)
        {            
            //Pass an Options View object to our Navigation View
            nView.switchToScorePanel(sView);
        }
    }     
 
    class OptionButtonListener implements ActionListener {            
        public void actionPerformed(ActionEvent e)
        {            
            //Pass an Options View object to our Navigation View
            nView.switchToOptionPanel(oView);
        }
    } 
    
    class AboutButtonListener implements ActionListener {            
        public void actionPerformed(ActionEvent e)
        {            
            //Pass an Options View object to our Navigation View
            nView.switchToAboutPanel(aPanel);
        }
    } 
    
    class CreditButtonListener implements ActionListener {            
        public void actionPerformed(ActionEvent e)
        {            
            //Pass an Options View object to our Navigation View
            nView.switchToCreditPanel(cPanel);
        }
    } 
    
}

