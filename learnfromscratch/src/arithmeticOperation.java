public class arithmeticOperation {
    private int a;
    private int b;
    static int i;
    static  int j;

    static {
        // 类实力化之前给i，j赋值
        System.out.println("执行静态代码块");
        i = 10;
        j = 20;
    }
    arithmeticOperation(int x, int y) {
        // 类实力化时给a. b赋参数x，y的值
        System.out.println("执行构造函数");
        a = x;
        b = y;
    }

    int add() {
        // 普通方法所有变量均可访问
        System.out.println("静态变量加法操作，结果为：" + (i + j));
        return a + b;
    }
    int minus() {
        System.out.println("静态变量加法操作" + (i - j));
        return a - b;
    }
    static int multiplied() {
        // 静态方法只能访问静态变量
        return i * j;
    }
    static int divided() {
        return i / j;
    }

    public static void main(String[] args) {
        arithmeticOperation ao = new arithmeticOperation(8, 2);
        System.out.println("创建类的对象后通过对象名调用");
        System.out.println(ao.add());
        System.out.println(ao.minus());

        System.out.println("类名调用静态方法");
        System.out.println(arithmeticOperation.multiplied());
        System.out.println("对像名调用静态方法");
        System.out.println(ao.divided());
    }
}
