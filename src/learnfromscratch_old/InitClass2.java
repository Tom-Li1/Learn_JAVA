public class InitClass2 { // 二维数组初始化三种方式
    public static void main(String[] args) {
        int scores_1[][] = new int[2][5]; // 默认初始化：存两个长度为五的一维数组
        scores_1[1][4] = 114;
        System.out.println("scores_1[1][4]: " + scores_1[1][4]);

        int scores_2[][] = new int[2][]; // 动态初始化：存两个后来指定长度的一维数组
        scores_2[0] = new int[5]; // 初始化二维内部的第一个数组 指定长度为五
        scores_2[0][3] = 514;
        System.out.println("scores_2[0][3]: " + scores_2[0][3]);

        int scores_3[][] = { // 静态初始化 声明新数组后直接指定内部元素值
                {0, 1, 2},
                {3, 4, 5}};
        System.out.println("scores_3[1][2]: " + scores_3[1][2]);
    }
}
