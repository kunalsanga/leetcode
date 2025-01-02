import java.util.Scanner;

class Solution {
    public int reverse(int x) {
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10; // Extract the last digit
            x /= 10; // Remove the last digit from x

            // Check for overflow before adding the digit
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; // Overflow for positive integers
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; // Overflow for negative integers
            }

            reversed = reversed * 10 + digit; // Add the digit to the reversed number
        }

        return reversed;
    }
}

public class revINT {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter an integer to reverse: ");
        int input = scanner.nextInt();

        // Create a Solution object to call the reverse method
        Solution solution = new Solution();
        int result = solution.reverse(input);

        // Display the result
        System.out.println("Reversed number: " + result);

        // Close the scanner
        scanner.close();
    }
}
