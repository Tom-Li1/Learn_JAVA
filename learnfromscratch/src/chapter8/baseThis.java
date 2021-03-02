package chapter8;

public class baseThis {
    public baseThis getMyself() {
        return this;
    }
    public void show() {
        System.out.println("通过this关键字返回类本身");
    }

    public static void  main(String[] args) {
        baseThis bt = new baseThis();
        baseThis bt_this = bt.getMyself();
        bt_this.show();
    }
}
