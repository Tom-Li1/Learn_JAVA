public class TraverseArray3 {
    public static void main(String[] args) {
        int array[][][] = { // 静态初始化一个三维数组
                {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
                {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}},
                {{1, 1, 4}, {0, 0, 0}, {5, 1, 4}},
        };

        for (int x = 0; x < array.length; x++) {
            System.out.println("----------");
            for (int y = 0; y < array[x].length; y++) {
                for (int z = 0; z < array[x][y].length; z++) {
                    System.out.print(array[x][y][z] + "\t");
                }
                System.out.println();
            }
        }
    }
}
