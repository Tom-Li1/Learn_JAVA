public class exchange1 {
    public void swap(int x, int y) {
        int temp;
        System.out.println("交换前，x = " + x + ", y = " + y);
        temp = x;
        x = y;
        y = temp;
        System.out.println("交换后，x = " + x + ", y = " + y);
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        exchange1 ex = new exchange1();
        System.out.println("执行swap(), a = " + a + ", b =  " + b);
        ex.swap(a, b);
        System.out.println("执行swap()后, a = " + a + ", b =  " + b);
    }
}
