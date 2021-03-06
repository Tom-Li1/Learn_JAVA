package learnfromscratch_new;
import java.util.Scanner;

public class BMIexponent {
    public static void main(String[] args) {
        double height;
        double weight;
        double exponent;
        Scanner sc = new Scanner(System.in);

        System.out.print("Height(m): ");
        height = sc.nextDouble();
        System.out.print("Weight(kg): ");
        weight = sc.nextDouble();
        exponent = weight / (height * height);

        System.out.println("Your height is " + height + "m");
        System.out.println("Your weight is " + weight + "kg");
        System.out.println("Your BMI is " + exponent);

        System.out.print("You are ");
        if (exponent < 18.5) {
            System.out.print("too thin.");
        } else if (exponent >= 18.5 && exponent < 24.9) {
            System.out.print("very good.");
        } else if (exponent >= 24.9 && exponent < 29.9) {
            System.out.print("too fat");
        } else {
            System.out.print("a piece of big fat shit.");
        }
    }
}
