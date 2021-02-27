public class roundArea1234 {
    //无参数无返回值
    void area1() {
        int a = 5;
        System.out.println("半径为" + a + "的圆的面积为：" + (3.14 * a * a));
    }

    //无参数有返回值
    double area2() {
        int a = 10;
        return (a * a * 3.14);
    }

    //有参数无返回值
    void area3(int a) {
        System.out.println("半径为" + a + "的圆的面积为：" + (3.14 * a * a));
    }

    //有参数有返回值
    double area4(int a) {
        return 3.14 * a * a;
    }

    public static void main(String[] args) {
        roundArea1234 ra = new roundArea1234();
        ra.area1();
        System.out.println("半径为20的圆的面积为：" + ra.area2());
        ra.area3(15);
        System.out.println("半径为20的圆的面积为：" + ra.area4(20));
    }
}
