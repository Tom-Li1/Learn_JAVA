package learnfromscratch_new.practice;

public class BuyTicket {
    public static void main(String[] args) {
        double tallKidHeight = 1.50;
        double shortKidHeight = 1.00;
        boolean tallBuy = (tallKidHeight > 1.2);
        boolean shortBuy = (shortKidHeight > 1.2);

        System.out.println("Buy ticket for kid who is " + tallKidHeight + "m tall: " + tallBuy);
        System.out.println("Buy ticket for kid who is " + shortKidHeight + "m tall: " + shortBuy);
    }
}
