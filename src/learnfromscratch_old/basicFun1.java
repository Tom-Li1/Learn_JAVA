public class basicFun1 {
    void showStars(int StarNum, boolean ln) {
        for (int i = 0; i < StarNum; i++) {
            System.out.print("*");
        }
        if (ln) {
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        basicFun1 fun1 = new basicFun1();
        fun1.showStars(15, true);
        System.out.println("独立宣言：我是傻逼");
        fun1.showStars(15, false);
    }
}
