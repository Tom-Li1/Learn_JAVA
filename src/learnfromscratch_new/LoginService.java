package learnfromscratch_new;
import java.util.Scanner;

public class LoginService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Passwd:");
        int psd = sc.nextInt();
        boolean result = (psd == 123456);
        System.out.print("Is password correct: " + result);
    }
}
