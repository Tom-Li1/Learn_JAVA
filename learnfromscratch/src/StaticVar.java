public class StaticVar {
    static String name = "Giao";
    public static void main(String[] args) {
        System.out.println("通过类名访问静态变量：" + StaticVar.name);

        StaticVar.name = "Peter";
        System.out.println("通过类名修改后的静态变量：" + StaticVar.name);

        StaticVar obj = new StaticVar();
        System.out.println("通过对象名访问静态变量：" + obj.name);

        obj.name = "Duan";
        System.out.println("通过对象名修改静态变量：" + obj.name);

        StaticVar obj_1 = new StaticVar();
        System.out.println("通过另一个对象访问静态变量：" + obj_1.name);

    }
}
