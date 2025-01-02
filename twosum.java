class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n; j++) {
                for(int k=j+1;k<n;k++){
                    if (nums[i] + nums[j] +nums[k]== target) {
                        return new int[]{i, j,k};
                    }

                }
                
            }
        }
        return new int[]{};
    }
}
public class twosum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums = {11, 15,3,3,3};
        int target = 9;             
        
        int[] result = solution.twoSum(nums, target);
        
        if (result.length == 3) {
            System.out.printf("[%d, %d,%d]%n", result[0], result[1],result[2]);
        } else {
            System.out.println("No solution found.");
        }
    }
    
}
