import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Input the year:");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0) ? true : false;
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        }
        else {
            System.out.println(year + " is NOT a leap year.");
        }
    }
}
