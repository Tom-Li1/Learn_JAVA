package learnfromscratch_new.practice;

public class InttoChar { // 输出65-71显式转型char的结果
    public static void main(String[] args) {
        int[] ints = new int[7]; // 储存65-71的整型
        char[] chars = new char[7]; // 储存65-71的char

        // 填充ints数组
        for (int i = 65; i < 72; i++) {
            ints[i - 65] = i;
        }

        // 显式转型并储存
        for (int i = 0; i < 7; i++) {
            chars[i] = (char) ints[i];
        }

        // 输出转换结果
        for (char c : chars) {
            System.out.print(c + "");
        }
    }
}
