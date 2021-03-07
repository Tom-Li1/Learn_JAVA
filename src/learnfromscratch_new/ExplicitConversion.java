package learnfromscratch_new;

public class ExplicitConversion {
    public static void main(String[] args) {
        int a = (int) 45.44;
        long f = (long) 456.6f;
        char c = (char) 97.31;
        System.out.println("45.44 convert to int: " + a);
        System.out.println("456.6f convert to long: " + f);
        System.out.println("97.31 convert to char: "+ c);
    }
}
