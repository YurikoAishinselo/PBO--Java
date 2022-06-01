package ArcadeGame;

import java.util.Random;

public class Games {
    Random rand = new Random();
    private final int playcost = 5;
    private int winTicket;
    public void swipe(Cards card){
        if (card.getCreditBalance()< playcost){
            System.out.println("Sorry you don't have enough credit");
            return;
        }
        int creditRemain = card.getCardNumber();
        card.setCardNumber(creditRemain);
        System.out.println("-------------------------");
        System.out.println("Welcome to this Random Win Games");
        winTicket = rand.nextInt(2)+5;
        System.out.println("Congratulation, you can take your prize");
        System.out.println("You TIcket : " + winTicket);
        card.setTicketBalance(card.getticketBalance()+winTicket);
        
    }
    
}
