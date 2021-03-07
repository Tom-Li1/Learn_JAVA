package learnfromscratch_new;

public class ImplicitConversion {
    public static void main(String[] args) {
        byte mybyte = 127;
        int myint = 124;
        float myfloat = 125.132f;
        char mychar = 121;
        double mydouble = 127.321;

        // 不同类型的数值计算时会自动隐式转型
        System.out.println("byte + float = " + (mybyte + myfloat));
        System.out.println("byte * int = " + (mybyte * myint));
        System.out.println("byte / char = " + (mybyte / mychar));
        System.out.println("double + char = " + (mydouble + mychar));
    }
}