public class VarType2_6 {
    int temp;
    public void func1(int temperature) {
        double Tp = -273.15;
        double t = Tp + temperature;
        System.out.println("摄氏度 " + temperature + "℃ 对应的开尔文为：" + t);
    }

    public static void main(String[] args) {
        VarType2_6 vartype = new VarType2_6();
        vartype.temp = 40;
        vartype.func1(vartype.temp);
    }
}
