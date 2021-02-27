public class overLoad {
    int add(int a, int b) {
        System.out.println("包含两个int变量的方法被调用");
        return a + b;
    }

    double add(double a, double b) {
        System.out.println("包含两个double变量的方法被调用");
        return a + b;
    }

    String add(String a, String b) {
        System.out.println("包含两个String类型的方法被调用");
        return a + b;
    }

    public static void main(String[] args) {
        overLoad ol = new overLoad();
        System.out.println("int a + b: " + ol.add(1, 2));
        System.out.println("int a + b: " + ol.add(1.0, 2.0));
        System.out.println("int a + b: " + ol.add("1", "2"));

    }
}
