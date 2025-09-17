import java.util.Scanner;

public class MinutesToYMD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total minutes: ");
        long minutes = sc.nextLong();

        long days = minutes / (60 * 24); // total days
        long years = days / 365;
        days = days % 365;
        long months = days / 30;
        days = days % 30;

        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + days);
    }
}
