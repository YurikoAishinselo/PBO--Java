package soccerleague;

import javax.swing.JOptionPane;

/**
 *
 * @author yurikoaishinselo
 */
public class Team {
    private String name ;
    private int totalWin,totalLose,tie;
    
    public String getName(){
        return name;
    }
    public void setName (String name){
        this.name= name;
    }
    
    public void setTotalWin (int x){
        totalWin += x;
    }
    
    public void setTotalLose (int x){
        totalLose += x;
    }
    
    public void setTie (int x){
        tie += x;
    }
    
    public static void scoring(Team yourteam, Team opponentTeam, int yourscore, int opponentscore){
        if (yourscore > opponentscore) {
            System.out.println("YOU WIN!");
            yourteam.setTotalWin(1);
            opponentTeam.setTotalLose(1);
        } else if (yourscore < opponentscore) {
            System.out.println("You lose!");
            opponentTeam.setTotalWin(1);
            yourteam.setTotalLose(1);
        } else {
            System.out.println("It's a tie!");
            opponentTeam.setTie(1);
            yourteam.setTie(1);
            
            
        }
    }
}
