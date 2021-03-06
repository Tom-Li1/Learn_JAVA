public class Var {
    int memberVariable;
    void fun1() {
        memberVariable = 100;
        int localVariable = 1;
        System.out.println("memberVariable: " + memberVariable + ", localVariable: " + localVariable);
    }
    void fun2() {
        memberVariable = 1;
        int localVariable = 10;
        System.out.println("memberVariable: " + memberVariable + ", localVariable: " + localVariable);
    }
    void fun3() {
        //System.out.println("localVariable: " + localVariable);
        // 方法中访问其它方法的局部变量将抛出异常
    }

    public static void main(String[] args) {
        Var v = new Var();
        v.fun1();
        v.fun2();
    }
}
