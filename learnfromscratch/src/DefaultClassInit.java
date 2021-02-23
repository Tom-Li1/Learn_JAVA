public class DefaultClassInit {
    public static void main(String[] args) {
        int ints[] = new int[3];
        double doubles[] = new double[3];
        char chars[] = new char[3];
        boolean booleans[] = new boolean[3];
        String strings[] = new String[3];

        for (int c = 0; c <= 2; c++) {
            System.out.println("ints数组第" + c + "个默认元素值：" + ints[c]);
            System.out.println("doubles数组第" + c + "个默认元素值：" + doubles[c]);
            System.out.println("chars数组第" + c + "个默认元素值：" + chars[c]);
            System.out.println("booleans数组第" + c + "个默认元素值：" + booleans[c]);
            System.out.println("strings数组第" + c + "个默认元素值：" + strings[c]);
            System.out.println();
        }
    }
}
