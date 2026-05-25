import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();

        // Basic for loop
        System.out.println("\n--- Counting 1 to " + limit + " ---");
        for (int i = 1; i <= limit; i++) {
            System.out.println("Count: " + i);
        }

        // For loop - Sum of numbers
        int sum = 0;
        for (int i = 1; i <= limit; i++) {
            sum += i;
        }
        System.out.println("\nSum of 1 to " + limit + " = " + sum);

        // For loop - Multiplication table
        System.out.print("\nEnter a number for multiplication table: ");
        int num = sc.nextInt();
        System.out.println("\n--- Multiplication Table of " + num + " ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        sc.close();
    }
}
