
import java.util.ArrayList;


public class ScoreModel {
      ArrayList <String> userNames = new ArrayList<>();
      ArrayList <Integer> scores = new ArrayList <Integer> ();
       
    ScoreModel() {
     
     
    }
   
    
    public ArrayList getuserNames(){
        userNames.add("Lauren");
        userNames.add("Zach");
        userNames.add("Nathan");
      return userNames;
    }
    public ArrayList getScores(){
         scores.add(1000);
        scores.add(2000);
        scores.add(3000);
      return scores;
    }
    
}
