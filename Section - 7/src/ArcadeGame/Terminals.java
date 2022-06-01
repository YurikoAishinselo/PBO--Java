package ArcadeGame;

import java.util.Scanner;

/**
 *
 * @author yurikoaishinselo
 */
public class Terminals {
    PrizeCategory doll = new PrizeCategory(10, 3, "Doll");
    PrizeCategory toyGun = new PrizeCategory(5, 5, "Toy Gun");
    PrizeCategory eraser = new PrizeCategory(3, 10, "Eraser");
    
    public void convert(Cards card){
        Scanner crd = new Scanner(System.in);
        System.out.println("Card Number : "+card.getCardNumber());
        System.out.print("Buy credits (1$ for 2 credits) : $");
        int credit = crd.nextInt()*2;
        card.setCreditBalance(credit + card.getCreditBalance());
        System.out.println("Card"+card.getCardNumber() +", " + " Your credit Total : "+ card.getCreditBalance());
        System.out.println("-------------------------");
        
    }
    
    public void transferBalance(Cards card1, Cards card2){
        Scanner crd = new Scanner(System.in);
        if (card1.getCreditBalance() == 0){
            System.out.println("Sorry you can't transfer anything");
            return;
        }
        System.out.print("How many credit you want transfer from " + card1.getCardNumber()+" to "+card2.getCardNumber()+ " : ");
        int crdt =crd.nextInt();
        card1.setCreditBalance(card1.getCreditBalance() - crdt);
        card2.setCreditBalance(card2.getCreditBalance() + crdt);
        System.out.println(card1.getCardNumber()+ " has "+ card1.getCreditBalance() + " credits");
        System.out.println(card2.getCardNumber()+ " has " + card2.getCreditBalance() + " credits");
    }
    public Cards transferTicket (Cards card1, Cards card2){
        Scanner crd = new Scanner(System.in);
        if (card1.getCreditBalance() == 0){
            System.out.println("Sorry you can't buy tickets");
            return card1;
        }
        System.out.println("-------------------------");
        System.out.print("How many ticket you want transfer from " + card1.getCardNumber()+" to "+card2.getCardNumber()+ " : ");
        int crdtTicket =crd.nextInt();
        card1.setCreditBalance(card1.getticketBalance()+ crdtTicket);
        card2.setCreditBalance(card2.getticketBalance()- crdtTicket);
        System.out.println(card1.getCardNumber()+ " has "+ card1.getticketBalance() + " Ticket");
        System.out.println(card2.getCardNumber()+ " has " + card2.getticketBalance()+ " Ticket");
        System.out.println("-------------------------");
        return null;
    }
    public void exchange(Cards card){
        Scanner crd = new Scanner(System.in);
        System.out.println("==   Exchange Machine   ==");   
        System.out.println("1. Doll (10 tickets)");
        System.out.println("2. Toy Guns (5 tickets)");
        System.out.println("3. Eraser (3 tickets)");
        System.out.print("Choice : ");
        int choice = crd.nextInt();
        switch (choice){
            case 1:
                if (card.getticketBalance() < doll.getTicket()){
                    System.out.println("Sorry your ticket is not enough");
                    break;
                }
                if (doll.getQty() == 0){
                    System.out.println("Sorry it's out of stock");
                    break;
                }
                doll.setQty(doll.getQty()-1);
                card.setTicketBalance(card.getticketBalance()-doll.getTicket());
                System.out.println("Congratulation, now you can take this funny doll");
                System.out.println("Now you have "+card.getticketBalance() + "tickets");
                break;
            case 2 :
                if (card.getticketBalance() < toyGun.getTicket()){
                    System.out.println("Sorry your ticket is not enough");
                    break;
                }
                if (toyGun.getQty() == 0){
                    System.out.println("Sorry it's out of stock");
                    break;
                }
                toyGun.setQty(toyGun.getQty()-1);
                card.setTicketBalance(card.getticketBalance()- toyGun.getTicket());
                System.out.println("Congratulation, now you can take this gun");
                System.out.println("Now you have "+card.getticketBalance() + " tickets");
                break; 
            case 3 :
                if (card.getticketBalance() < eraser.getTicket()){
                    System.out.println("Sorry your ticket is not enough");
                    break;
                }
                if (eraser.getQty() == 0){
                    System.out.println("Sorry it's out of stock");
                    break;
                }
                eraser.setQty(eraser.getQty()-1);
                card.setTicketBalance(card.getticketBalance()- eraser.getTicket());
                System.out.println("Congratulation, now you can take this eraser");
                System.out.println("Now you have "+card.getticketBalance() + "tickets");
                break; 
            default:
                System.out.println("Error, please try again");
                this.exchange(card);
                }
        System.out.println("-------------------------");
        
        }
}

