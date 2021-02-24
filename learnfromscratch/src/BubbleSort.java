import java.util.Random;
public class BubbleSort {
    public static void main(String[] args) {
        int numbers[] = new int[10];
        Random random = new Random();

        // 随机数填充数组并展示排序前的数组
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(101);
        }
        System.out.println("The list before sort:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n");

        // 对数组进行bubble排序
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    numbers[j] ^= numbers[j + 1];
                    numbers[j + 1] ^= numbers[j];
                    numbers[j] ^= numbers[j + 1];
                }
            }
        }
        System.out.println("The list after sort:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
