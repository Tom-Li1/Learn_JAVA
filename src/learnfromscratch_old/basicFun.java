public class basicFun {
    private int num; // 初始化变量num
    void setParam(int a) { // 将参数a赋值于num
        num = a;
    }
    int getParam() { // 返回int类型的num
        return num;
    }
    public static void main(String[] args) {
        basicFun fun = new basicFun(); // 创建basicFun类的对象
        fun.setParam(114514);
        System.out.println("The param is " + fun.getParam());
    }
}
