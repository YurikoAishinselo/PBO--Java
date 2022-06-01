package ArcadeGame;
public class Cards {
    private int creditBalance;
    private int ticketBalance;
    private int cardNumber;
    public int getCreditBalance(){
        
        return creditBalance;
    
    }
    public void setCreditBalance(int creditBalance){
        this.creditBalance = creditBalance;
    }
    public int getticketBalance(){
        return ticketBalance;
    }
    public void setTicketBalance(int ticketBalance){
        this.ticketBalance = ticketBalance;
    }
    public int getCardNumber(){
        return cardNumber;
    }
    public void setCardNumber(int cardNumber){
        this.cardNumber = cardNumber;
    }
    public Cards(int number,int card,int ticket){
        creditBalance = card;
        ticketBalance = ticket;
        cardNumber = number;
    }

   
    
}
