
import java.util.ArrayList;
import java.util.ArrayList;
import java.io.*;

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
    public void saveInfotoFile(ArrayList <String> usernames, ArrayList <Integer> scores){
        try{
            PrintWriter out = new PrintWriter("HighScoreInfo.txt");
            for(int i=0; i<usernames.size(); i++){
                String name= usernames.get(i);
                Integer score = scores.get(i);
                out.println(name + " "+ score);
            }
            out.close();
        }catch(Exception e){
            String errStr = e.getMessage();
            System.out.println(errStr);
        }
    }
}
