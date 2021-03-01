public class staticField {
    // 先执行静态块
    static {
        System.out.println("父类中，静态块被执行");
    }
    // 然后执行非静态块
    {
        System.out.println("父类中，非静态块被执行");
    }
    // 最后执行构造函数
    staticField() {
        System.out.println("父类中，构造函数被执行");
    }
}

class childClass extends staticField {
    // 先执行父类中的静态块（如果有）再执行子类中的静态块
    static {
        System.out.println("子类中，静态块被执行");
    }
    {
        System.out.println("子类中，非静态块被执行");
    }
    childClass() {
        System.out.println("子类中，构造函数被执行");
    }

    public static void main(String[] args) {
        //创建对象之前 父类和子类中的静态块先执行
        childClass cc = new childClass();
        // 创建对象后 父类中的非静态块和构造函数先执行
        // 最后执行子类中的非静态块和构造函数
    }
}

