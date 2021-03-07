package learnfromscratch_new.practice;

public class SumAtoG {
    public static void main(String[] args) {
        char[] chars = new char[7];
        for (char i = 65; i < 72; i++) {
            chars[i - 65] = i;
        }

        int sum = 0;
        for (char i : chars) {
            sum += i;
        }
        System.out.println("The sum of char A to char G is: " + sum);
    }
}
