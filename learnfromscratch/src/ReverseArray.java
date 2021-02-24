import java.util.Random;
public class ReverseArray {
    public static void main(String[] args) {
        int numbers[] = new int[10];
        Random random = new Random();

        // 随机数填充数组并展示排序前的数组
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(101);
        }
        System.out.println("The list before reverse:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n");

        // 开始反转列表
        for (int i = 0, j = numbers.length - 1; i < j; i++, j-- ) {
            System.out.println(i + ' ' + j);
        }
    }
}
