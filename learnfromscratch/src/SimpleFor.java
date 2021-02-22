public class SimpleFor {
    public static void main(String[] args) {
        int sum = 0;
        int i;
        for (i = 0; i < 101; i++) {
            sum += i;
        }
        System.out.println("1 + 2 + 3 + ... + 100 = " + sum);
    }
}
