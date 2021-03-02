package chapter8;
public class MyEmployee {
    String name;
    int age;
    long income;

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public long getIncome() {
        return income;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setIncome(long income) {
        this.income = income;
    }

    public static void main(String[] args) {
        MyEmployee peter_duan = new MyEmployee();
        peter_duan.setAge(18);
        peter_duan.setName("Peter Duan");
        peter_duan.setIncome(100);

        System.out.println("Name: " + peter_duan.getName());
        System.out.println("Income: " + peter_duan.getIncome());
        System.out.println("Age: " + peter_duan.getAge());
    }
}
