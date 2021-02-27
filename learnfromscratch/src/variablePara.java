public class variablePara {
    int sumArgs(int...n) {
        System.out.println("可变参数列表的方法被调用");
        int sum = 0;
        for (int i : n) {
            sum += i;
        }
        return sum;
    }
    int sumArgs(int a, int b) {
        System.out.println("不可变参数方法被调用");
        return a + b;
    }

    public static void main(String[] args) {
        variablePara vp = new variablePara();
        int a = 1, b = 2, c = 3, d = 4, e = 5;
        System.out.println("a, b, c, d, e: 1, 2, 3, 4, 5");
        System.out.println("传入a，返回值：" + vp.sumArgs(a));
        System.out.println("传入a与b，返回值：" + vp.sumArgs(a, b));
        System.out.println("传入abcde，返回值：" + vp.sumArgs(a, b, c, d, e));

    }

}
