package chapter8;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.System.out;

public class importStatic {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        out.println(a + " and " + b + ", the bigger one is " + max(a, b));
        out.println(a + " and " + b + ", the smaller one is " + min(a, b));
    }
}