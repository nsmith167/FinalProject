
import java.util.ArrayList;


public class ScoreModel {
      ArrayList <String> userNames = new ArrayList<>();
      ArrayList <Integer> scores = new ArrayList <Integer> ();
    
    ScoreModel() {
        
        userNames.add("LMD");
        scores.add(1000);
    }
    public ArrayList getuserNames(){
      return userNames;
    }
    public ArrayList getScores(){
      return scores;
    }
    
}
