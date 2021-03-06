import java.util.Random;
public class ReverseArray {
    public static void main(String[] args) {
        int numbers[] = new int[10];
        Random random = new Random();

        // 随机数填充数组并展示排序前的数组
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(11);
        }
        System.out.println("The list before reverse:");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // 开始反转数组
        for (int i = 0, j = numbers.length - 1; i < j; i++, j--) {
            numbers[i] ^= numbers[j];
            numbers[j] ^= numbers[i];
            numbers[i] ^= numbers[j];
        }

        // 展示反转后的数组
        System.out.println("The list after reverse:");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }
}
