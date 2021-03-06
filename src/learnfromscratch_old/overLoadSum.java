public class overLoadSum {
    int getSum(int a, int b) {
        System.out.println("调用了两个参数的方法");
        return a + b;
    }
    int getSum(int a, int b, int c) {
        System.out.println("调用了三个参数的方法");
        return a + b + c;
    }

    public static void main(String[] args) {
        overLoadSum ols = new overLoadSum();
        int a = 1, b = 2, c = 3;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("传递两个参数，返回值为：" + ols.getSum(1, 2));
        System.out.println("传递三个参数，返回值为：" + ols.getSum(1, 2, c));

    }
}
