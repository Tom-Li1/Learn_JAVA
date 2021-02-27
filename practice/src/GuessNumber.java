import java.util.Scanner;
import java.util.Random;
public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int inputNumber = 1;
        int answer;

        while (inputNumber > 0) {
            answer = random.nextInt(100);
            System.out.print("New round started.\nWhat is your number? (input -1 to quit)\n>>>");
            inputNumber = input.nextInt();
            while (inputNumber > 0) {
                if (inputNumber > answer) {
                    System.out.print("Too big.\n>>>");
                } else if (inputNumber < answer) {
                    System.out.print("Too small.\n>>>");
                } else {
                    System.out.print("You win, the number is " + answer + ".");
                    break;
                }
                inputNumber = input.nextInt();
            }
        }
    }
}