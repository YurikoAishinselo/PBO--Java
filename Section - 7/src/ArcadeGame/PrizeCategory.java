package ArcadeGame;

/**
 *
 * @author yurikoaishinselo
 */
public class PrizeCategory {
    private String prize;
    private int Ticket;
    private int qty;
    
    public PrizeCategory(int Ticket, int qty, String prize){
        this.prize = prize;
        this.qty = qty;
        this.Ticket = Ticket;
    }
    public String getPrize(){
        return prize;
    }
    public int getTicket(){
        return Ticket;
    }
    public int getQty(){
        return qty;
    }
    public void setPrize(String prize){
        this.prize=prize;
    }
    public void setTicket(int Ticket){
        this.Ticket=Ticket;
    }
    public void setQty(int qty){
        this.qty=qty;
    }
}
