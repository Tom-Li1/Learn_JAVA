public class SimpleBreak {
    public static void main(String[] args) {
        int flag = 1;

        for (int i = 3; i <= 1000; i++ ) {
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = 0;
                    System.out.println(i + "不是素数");
                    break;
                } else {
                    flag = 1;
                    continue;
                }
            }
            if (flag == 1) {
                System.out.println(i + "是素数");
            }
        }
    }
}
