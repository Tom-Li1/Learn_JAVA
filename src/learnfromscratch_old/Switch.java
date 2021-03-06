import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("输入小于等于7且大于0的数字：");
        int num = input.nextInt();

        switch (num) {
            case 1:
                System.out.print(num + "代表星期一");
                break;
            case 2:
                System.out.print(num + "代表星期二");
                break;
            case 3:
                System.out.print(num + "代表星期三");
                break;
            case 4:
                System.out.print(num + "代表星期四");
                break;
            case 5:
                System.out.print(num + "代表星期五");
                break;
            case 6:
                System.out.print(num + "代表星期六");
                break;
            case 7:
                System.out.print(num + "代表星期七");
                break;
            default:
                System.out.print(num + "代表你的鸡巴");
        }
    }
}
