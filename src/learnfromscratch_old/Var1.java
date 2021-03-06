public class Var1 {
    String var = "in class";
    void fun1() {
        String var = "in fun1";
        System.out.println(var);
    }
    void fun2() {
        // 方法内声明了与成员变量重名的局部变量 成员变量将会被局部变量覆盖 同时不改变成员变量
        String var = "in fun2";
        System.out.println(var);
    }
    void fun3(){
        System.out.println(var);
    }

    public static void main(String[] args) {
        Var1 v1 = new Var1();
        v1.fun1();
        v1.fun2();
        v1.fun3();
    }
}
