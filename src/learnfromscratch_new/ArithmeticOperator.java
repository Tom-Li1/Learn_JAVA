package learnfromscratch_new;
import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input two numbers and separate them with a blank (num1 num2): ");
        double num1 = sc.nextByte();
        double num2 = sc.nextDouble();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        sc.close();
    }
}
