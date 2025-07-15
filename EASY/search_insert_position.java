class Solution {
    public int searchInsert(int[] nums, int target) {
        // Initialize pointers for the binary search
        int left = 0; // Start of the array
        int right = nums.length - 1; // End of the array

        // Perform binary search while the range is valid
        while (left <= right) {
            // Calculate the middle index to prevent overflow
            int mid = left + (right - left) / 2;

            // Check if the target is at the middle index
            if (nums[mid] == target) {
                return mid; // Target found, return the index
            } 
            // If target is greater, it must be in the right half
            else if (nums[mid] < target) {
                left = mid + 1; // Move the left pointer to narrow the range
            } 
            // If target is smaller, it must be in the left half
            else {
                right = mid - 1; // Move the right pointer to narrow the range
            }
        }

        // If the target is not found, return the left pointer
        // Left will indicate the position where the target should be inserted
        return left;
    }
}

public class search_insert_position {
    public static void main(String[] args) {
        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Example inputs
        int[] nums = {1, 3, 5, 6};
        int target1 = 5; // Should return 2
        int target2 = 2; // Should return 1
        int target3 = 7; // Should return 4

        // Call the searchInsert method and print the results
        System.out.println("Target: " + target1 + ", Output: " + solution.searchInsert(nums, target1));
        System.out.println("Target: " + target2 + ", Output: " + solution.searchInsert(nums, target2));
        System.out.println("Target: " + target3 + ", Output: " + solution.searchInsert(nums, target3));
    }
}
