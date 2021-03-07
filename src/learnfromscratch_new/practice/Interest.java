package learnfromscratch_new.practice;

public class Interest {
    public static void main(String[] args) {
        /* 当前存款15000
           年利率%295
           输出三年后存款与利息的和 */
        int depositNow = 15000;
        double interestRate = 0.0295;
        double depositFuture = depositNow * (1 + interestRate) * (1 + interestRate) * (1 + interestRate);
        System.out.println("Interest rate: " + interestRate);
        System.out.println("----------Now-----------");
        System.out.println("Deposit: " + depositNow);
        System.out.println("-----3 Years Later------");
        System.out.println("Deposit: " + depositFuture);
    }
}