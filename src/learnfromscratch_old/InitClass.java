public class InitClass {
    public static void main(String[] args) {
        int[] scores; // 动态初始化
        scores = new int[3];
        scores[0] = 30;
        scores[1] = 40;
        scores[2] = 50;
        System.out.println("scores[2] is " + scores[1] );

        String[] names = {"giao", "wow", "shit"}; // 静态初始化
        System.out.println("names[1] is " + names[2]);
    }
}
