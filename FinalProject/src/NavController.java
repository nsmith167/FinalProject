
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NavController {
    
    private NavModel nModel;
    private NavView nView;
    
    private GameView gView;
    
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
        
        gView = new GameView();
        
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
        @Override
        public void actionPerformed(ActionEvent e) {            
            //Pass a Main View object to our Navigation View
            nView.switchToGamePanel(gView);
            gView.run();
            //Pass data from Options to Game View
            gView.setSnakeValues(oModel.getSnakeSpeed(), oModel.getSnakeColor());
            gView.setAppleSize(oModel.getAppleSize());
        }
    }
    
    class ScoreButtonListener implements ActionListener { 
        @Override
        public void actionPerformed(ActionEvent e)
        {
            gView.pause();
            nView.switchToScorePanel(sView);
            if(gView.pressedSave())
            {
                sModel.addUserName(gView.saveName());
                sModel.addScore(gView.saveScore());
                sModel.saveInfotoFile(sModel.getuserNames(), sModel.getScores());
                gView.resetSave();
            }
            sView.displayScores();
        }
    }     
 
    class OptionButtonListener implements ActionListener {   
        @Override
        public void actionPerformed(ActionEvent e) {
            gView.pause();
            nView.switchToOptionPanel(oView);
        }
    } 
    
    class AboutButtonListener implements ActionListener {  
        @Override
        public void actionPerformed(ActionEvent e) {
            gView.pause();
            nView.switchToAboutPanel(aPanel);
        }
    } 
    
    class CreditButtonListener implements ActionListener { 
        @Override
        public void actionPerformed(ActionEvent e) {
            gView.pause();
            nView.switchToCreditPanel(cPanel);
        }
    } 
    
}

