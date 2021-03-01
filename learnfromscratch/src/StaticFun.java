public class StaticFun {
    static String staticName = "Peter Duan";
    String name = "Oliver Wang";

    static void staticGetName() {
        // 静态方法访问非静态变量会报错（实例化之前 非静态变量未初始化）
        System.out.println("Show name in static method: " + staticName);
    }

    void getName() {
        System.out.println("Show name in common method: " + name);
        System.out.println("Show name in common method: " + staticName);
    }

    public static void main(String[] args) {
        System.out.println("创建对象前用类名调用静态方法");
        StaticFun.staticGetName(); //静态变量可以在实例化之前 通过类名调用

        System.out.println("创建对象并用对象名调用静态方法");
        StaticFun sf = new StaticFun();
        sf.getName();
        sf.staticGetName();
    }
}
