public class ComparisonOperator {
    public static void main(String[] args) {
        boolean isTrue;
        int a = 2;
        int b = 3;

        isTrue = (a == b);
        System.out.println(a + " == " + b + isTrue);

        isTrue = (a != b);
        System.out.println(a + " != " + b + isTrue);

        isTrue = (a > b);
        System.out.println(a + " > " + b + isTrue);

        isTrue = (a < b);
        System.out.println(a + " < " + b + isTrue);

        isTrue = (a >= b);
        System.out.println(a + " >= " + b + isTrue);

        isTrue = (a <= b);
        System.out.println(a + " <= " + b + isTrue);
    }
}
