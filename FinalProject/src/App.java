
/*
 *
 * Snake Game Final Project
 * @author Nathan
 * @author Lauren
 * @author Zach
 *
 */

public class App {
    
    public static void main(String[] args) {
        
        NavModel model = new NavModel();
        NavView view = new NavView(model);
        NavController controller = new NavController(model, view);

        view.setVisible(true);
        
    }
}