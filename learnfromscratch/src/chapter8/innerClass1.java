package chapter8;

public class innerClass1 {
    innerClass1() {
        System.out.println("外部类构造函数");
    }

    private int num;
    baseInnerClass bic = new baseInnerClass();

    public int getNum() {
        return num + 100;
    }
    public void setNum(int num) {
        this.num = num;
    }

    class baseInnerClass {
        baseInnerClass() {
            System.out.println("内部类构造函数");
        }
        public int getNum() {
            return num + 100;
        }
    }

    public static void main(String[] args) {
        innerClass1 ic = new innerClass1();
        ic.setNum(100);
        System.out.println("内部类计算结果值：" + ic.bic.getNum());
        System.out.println("外部类计算结果值：" + ic.getNum());
    }

}
