package learnfromscratch_new.practice;

public class ParkingNum {
    public static void main(String[] args) {
        int space = 70;
        int host = 5;
        for (int i = 0; i < host; i++) {
            System.out.println("There are " + (space - i) + " spaces when we have " + i + " hosts.");
        }
        System.out.println("......");
    }
}
