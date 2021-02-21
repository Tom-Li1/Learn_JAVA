public class ConditionOperator {
    public static void main(String[] args) {
        int a = 3;
        int b = 0;

        int max = (a > b) ? a : b;
        int min = (a < b) ? a : b;
        System.out.println("The great one is: " + max);
        System.out.println("The small one is: " + min);
    }
}
