public class TypeExchange2_8 {
    public static void main(String[] args) {
        int intNumber = 65;
        char character;
        double doubleNumber = 65.435;

        character = (char) intNumber;
        System.out.println("强制转换整形变量为字符：" + intNumber + " → " + character);

        intNumber = character;
        System.out.println("自动转换字符为整型变量：" + character + " → " + intNumber);

        intNumber = (int) doubleNumber;
        System.out.println("强制转换双精度型为整形：" + doubleNumber + " → " + intNumber);

        doubleNumber = intNumber;
        System.out.println("自动转换整型为双精度形：" + intNumber + " → " + doubleNumber);
    }
}
