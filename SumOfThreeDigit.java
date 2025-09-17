import java.util.Scanner;

public class SumOfThreeDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        int d1 = num / 100; // first digit
        int d2 = (num / 10) % 10; // middle digit
        int d3 = num % 10; // last digit

        int sum = d1 + d2 + d3;
        System.out.println("Sum of digits = " + sum);
    }
}
