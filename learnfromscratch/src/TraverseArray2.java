public class TraverseArray2 {
    public static void main(String[] args) {
        int array[][] = { // 初始化一个二维数组
                {0},
                {1, 2},
                {3, 4, 5},
                {6, 7, 8, 9},
                {10, 11, 12, 13},
                {14, 15, 16, 17, 18}
        };

        System.out.println("Common way to go through the list:");
        for (int i = 0; i < array.length; i++) { // 使用普通方法遍历
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nEnhance way to go through the list:");
        for (int line[] : array) {
            for (int i : line) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }

    }
}
