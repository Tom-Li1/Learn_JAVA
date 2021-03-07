package learnfromscratch_new.practice;

public class Scottare {
    public static void main(String[] args) {
        int standard =  3500;
        int salaryA = 3000;
        int salaryB = 4500;
        System.out.println(
                "Employees with monthly salary of " + salaryA + " should pay taxes: " + (salaryA > standard)
        );
        System.out.println(
                "Employees with monthly salary of " + salaryB + " should pay taxes: " + (salaryB > standard)
        );
    }
}
