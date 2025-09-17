import java.util.Scanner;

public class ReverseThreeDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        int d1 = num / 100; // first digit
        int d2 = (num / 10) % 10; // middle digit
        int d3 = num % 10; // last digit

        int reverse = (d3 * 100) + (d2 * 10) + d1;
        System.out.println("Reversed number = " + reverse);
    }
}
