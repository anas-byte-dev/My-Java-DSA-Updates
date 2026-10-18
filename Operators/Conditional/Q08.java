import java.util.Scanner;

// Q8: For a given year print true if it is a leap year or false (HackerRank: write-a-function)
public class Q08 {
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) ? true : ((year % 100 == 0) ? false : (year % 4 == 0));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.println(isLeapYear(year));
        sc.close();
    }
}
