import java.util.Scanner;

public class SwitchString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("输入全小写的星期英文单词：");
        String word = input.next();

        switch (word) {
            case "monday":
                System.out.print(word + " = 星期一");
                break;
            case "tuesday":
                System.out.print(word + " = 星期二");
                break;
            case "wednesday":
                System.out.print(word + " = 星期三");
                break;
            case "thursday":
                System.out.print(word + " = 星期四");
                break;
            case "friday":
                System.out.print(word + " = 星期五");
                break;
            case "saturday":
                System.out.print(word + " = 星期六");
                break;
            case "sunday":
                System.out.print(word + " = 星期七");
                break;
            default:
                System.out.print(word + " = 你的鸡巴");
        }
    }
}
