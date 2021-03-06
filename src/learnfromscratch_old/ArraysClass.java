import java.util.Arrays;
import java.util.Random;
public class ArraysClass {
    public static void main(String[] args) {
        Random random = new Random();
        // generate two identical arrays
        int scores_1[] = new int[10];
        int scores_2[] = new int[10];

        for (int i = 0; i < 10; i++) {
            scores_1[i] = random.nextInt(101);
        }
        System.arraycopy(scores_1, 0, scores_2, 0, scores_1.length);

        System.out.println("scores_1 and scores_2 before sort:");
        for (int i : scores_1) {
            System.out.print(i + "\t");
        }
        System.out.println("\nscores_1 after sort:");
        Arrays.sort(scores_1);
        for (int i : scores_1) {
            System.out.print(i + "\t");
        }

        System.out.println("\n\nFind the score in scores_2: " + scores_1[4]);
        int binarySearch = Arrays.binarySearch(scores_2, scores_1[4]);
        System.out.println(scores_1[4] + "'s index in scores_2 is " + binarySearch);

        System.out.println("\nIs scores_2 equal to scores_1: " + Arrays.equals(scores_1, scores_2));
        Arrays.sort(scores_2);
        System.out.println("Is scores_2 (sorted) equal to scores_1: " + Arrays.equals(scores_1, scores_2));
    }
}
