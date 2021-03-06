import java.util.Scanner;

public class SimpleDoWhile {
    public static void main(String[] args) {
        System.out.print("你的牛逼分数是多少？\n>>>");
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();

        do {
            if (score >= 90) {
                System.out.println("你的" + score + "分特别牛逼");
            } else if (score >= 80) {
                System.out.println("你的" + score + "分有点牛逼");
            } else if (score >= 60) {
                System.out.println("你的" + score + "分不算牛逼");
            } else {
                System.out.println("你的" + score + "分鸡巴玩意");
            }
            System.out.print("你的新牛逼分数是多少? （输入”-1“退出）\n>>>");
            score = input.nextInt();
        } while (score > 0);
        System.out.println("程序退出");
    }
}
