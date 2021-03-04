package chapter8;

public class innerThis {
    private int num;
    public void setNum(int num) {
        this.num = num;
    }
    public innerClass in_class = new innerClass();
    class innerClass {
        private int num;
        public void setNum(int num) {
            this.num = num;
        }
        public void showAll() {
            System.out.println("在内部类调用外部类的方法：setNum(50)");
            innerThis.this.setNum(50);
            System.out.println("外部类中num值为：" + innerThis.this.num);
            this.setNum(30);
            System.out.println("内部类中num值为：" + num);
        }
    }
    public void showAll() {
        this.setNum(90);
        System.out.println("外部类中调用外部类方法：this.setNum(90)");
        System.out.println("外部类中num值为：" + num);
        innerClass ic = new innerClass();
        ic.setNum(100);
        System.out.println("内部类中num值为：" + ic.num);
    }
    public static void main(String[] args) {
        innerThis out_class = new innerThis();
        out_class.setNum(100);
        System.out.println("调用外部类方法");
        out_class.showAll();
        System.out.println("调用内部类方法");
        out_class.in_class.showAll();
    }
}