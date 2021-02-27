import java.util.Scanner;
public class Exercise2 {
    int getMax(int a, int b) {
        System.out.print("Return a bigger integer: ");
        return Math.max(a, b);
    }

    float getMax(float a, float b) {
        System.out.print("Return a bigger float: ");
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exercise2 ex2 = new Exercise2();

        System.out.print("Float or integer (1 = float, 2 = integer):");
        int mode = sc.nextInt();
        if (mode == 1) {
            System.out.print("Input the first float:");
            float a = sc.nextFloat();
            System.out.print("Input the second float:");
            float b = sc.nextFloat();
            System.out.print(ex2.getMax(a, b));
        } else if (mode == 2) {
            System.out.print("Input the first integer:");
            int a = sc.nextInt();
            System.out.print("Input the second integer:");
            int b = sc.nextInt();
            System.out.print(ex2.getMax(a, b));
        } else {
            System.out.print("Unknown mode provided.");
        }
    }
}
