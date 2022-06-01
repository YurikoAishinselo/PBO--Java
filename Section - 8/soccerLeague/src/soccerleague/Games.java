
package soccerleague;

import java.util.ArrayList;
import java.util.*;


public class Games {
    private int score;
    private Team yourteam, team1,team2, team3;
    private ArrayList <Team> team;
    Random rand = new Random ();

    public Games(){
        naming();
        StartGames();
    }
    
    private void naming (){
        team1.setName("SD");
        team2.setName("SMP");
        team3.setName("SMA");
        team = new ArrayList();
        team.add(yourteam);
        team.add(team1);
        team.add(team2);
        team.add(team3);
    }
        

 public void StartGames(){
        int opponent = rand.nextInt();
        int opponentscore, yourscore;
        switch (opponent) {
            case 1:
                System.out.println("Your opponent: " + team1.getName());
                if (schedule.getTemperature() >= 20 && schedule.getTemperature() <= 25) {
                    yourscore = rand.nextInt(3);
                    opponentscore = rand.nextInt(3);
                } else if (schedule.getTemperature() > 25 && schedule.getTemperature() <= 30) {
                    yourscore = rand.nextInt(5) + 1;
                    opponentscore = rand.nextInt(5) + 1;
                } else {
                    yourscore = rand.nextInt(7) + 2;
                    opponentscore = rand.nextInt(7) + 2;
                }
                System.out.println("Your team score: " + yourscore);
                System.out.println("Your enemy score: " + opponentscore);
                Team.scoring(yourteam, team1, yourscore, opponentscore);
                break;
            case 2:
                System.out.println("Your opponent: " + team2.getName());
                if (schedule.getTemperature() >= 20 && schedule.getTemperature() <= 25) {
                    yourscore = rand.nextInt(3);
                    opponentscore = rand.nextInt(3);
                } else if (schedule.getTemperature() > 25 && schedule.getTemperature() <= 30) {
                    yourscore = rand.nextInt(5) + 1;
                    opponentscore = rand.nextInt(5) + 1;
                } else {
                    yourscore = rand.nextInt(7) + 2;
                    opponentscore = rand.nextInt(7) + 2;
                }
                System.out.println("Your team score: " + yourscore);
                System.out.println("Your enemy score: " + opponentscore);
                Team.scoring(yourteam, team2, yourscore, opponentscore);
                break;
            case 3:
                System.out.println("Your opponent: " + team3.getName());
                if (schedule.getTemperature() >= 20 && schedule.getTemperature() <= 25) {
                    yourscore = rand.nextInt(3);
                    opponentscore = rand.nextInt(3);
                } else if (schedule.getTemperature() > 25 && schedule.getTemperature() <= 30) {
                    yourscore = rand.nextInt(5) + 1;
                    opponentscore = rand.nextInt(5) + 1;
                } else {
                    yourscore = rand.nextInt(7) + 2;
                    opponentscore = rand.nextInt(7) + 2;
                }
                System.out.println("Your team score: " + yourscore);
                System.out.println("Your enemy score: " + opponentscore);
                Team.scoring(yourteam, team3, yourscore, opponentscore);
                break;
        }

    }
  
public void printStatement() {
    for (Team t : team) {
          System.out.println("Team: " + t.getName());
        }
    }
}
   
        
   
    
