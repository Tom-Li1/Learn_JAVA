package chapter8;

public class localInner {
    private int num;

    localInner() {
        System.out.println("执行外部类构造方法");
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return this.num;
    }

    public localInner getLocalInner() {
        class local extends localInner {
            private int age = 10;

            local() {
                System.out.println("执行局部内部类构造方法");
            }
        }
        local lc = new local();
        return lc;
    }
    public static void main(String[] args) {
        localInner li = new localInner();
        li.getLocalInner();
    }
}