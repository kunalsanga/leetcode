import java.util.Scanner;

class Solution {
    public int mysqrt(int x) {
        if (x == 0 || x == 1) {
            return x; // Return the number itself if it's 0 or 1.
        }
        int left = 0, right = x;
        int result = 0; // Initialize result.

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if mid*mid is less than or equal to x
            if ((long) mid * mid <= x) {
                result = mid; // Update result as mid might be the answer
                left = mid + 1; // Move to the right half
            } else {
                right = mid - 1; // Move to the left half
            }
        }
        return result; // Return the result.
    }
}

public class sqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int input = sc.nextInt(); // Input the number.
        
        Solution sol = new Solution();
        int op = sol.mysqrt(input); // Calculate the square root.

        System.out.println("Square root is: " + op); // Output the result.
        sc.close(); // Close the scanner.
    }
}
