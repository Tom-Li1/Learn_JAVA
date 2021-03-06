public class ArithmeticOperator {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;

        System.out.println("正号：" + +a);
        System.out.println("负号：" + -a);
        System.out.println("加号：a + b = " + (a + b));
        System.out.println("减号：a - b = " + (a - b));
        System.out.println("乘号：c * b = " + (c * b));
        System.out.println("除号：b / a = " + (b / a));
        System.out.println("求余：c % a = " + (c % a));

        c = ++a;
        System.out.println("前置自增：c = ++a，" + "c = " + c + " and " + "a = " + a);

        c = 7;
        a = c++;
        System.out.println("后置自增：a = c++，" + "a = " + a + " and " + "c = " + c);

        c = 7;
        c = --a;
        System.out.println("前置自减：c = --a，" + "c = " + c + " and " + "a = " + a);

        c = 7;
        a = c--;
        System.out.println("后置自减：a = c--，" + "a = " + a + " and " + "c = " + c);

        System.out.println("连接字符：Hello + ' ' + World + '!' = " + "Hello" + " " + "World" + "!");
    }
}
