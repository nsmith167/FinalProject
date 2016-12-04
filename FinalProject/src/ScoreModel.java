
import java.util.ArrayList;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class ScoreModel {
    //creating arraylists to store the username and scores of the players
      ArrayList <String> userNames = new ArrayList<>();
      ArrayList <Integer> scores = new ArrayList <Integer> ();
       
    ScoreModel() {
     
     
    }
   
    //sample usernames
    public ArrayList getuserNames(){
        userNames.add("Lauren");
        userNames.add("Zach");
        userNames.add("Nathan");
      return userNames;
    }
    //sample scores
    public ArrayList getScores(){
         scores.add(1000);
        scores.add(2000);
        scores.add(3000);
      return scores;
    }
    //writing the information to the Files, the info will be displayed as Username Score on each line
    public void saveInfotoFile(ArrayList <String> usernames, ArrayList <Integer> scores){
        try{
            PrintWriter out = new PrintWriter("HighScoreInfo.txt");
            for(int i=0; i<usernames.size(); i++){
                String name= usernames.get(i);
                Integer score = scores.get(i);
                out.print(name+" ");
                out.print(score);   
                out.println();
            }
            out.close();
        }catch(Exception e){
            String errStr = e.getMessage();
            System.out.println(errStr);
        }
    }
    
    //reading the information from the file in the form of an arraylist, each element has one username and score
    public ArrayList <String> readInfoFromFile(){
        ArrayList <String> theHighScoreInfo = new ArrayList();
        File highScoreFile = new File("HighScoreInfo.txt");
        
        try{
            Scanner scnr = new Scanner(highScoreFile);
            while(scnr.hasNextLine()){
                String tempStr= scnr.nextLine();
                theHighScoreInfo.add(tempStr);
            }
            scnr.close();
        }catch(Exception e){
            String errStr = e.getMessage();
            System.out.println(errStr);
        }
        //returning the arraylist from file
        return theHighScoreInfo;
    }}

