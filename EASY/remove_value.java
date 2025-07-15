<<<<<<< HEAD
class Solution{
    public int removeElement(int[] nums,int val){
        int k=0;
        for(int i=0;i< nums.length;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}
public class remove_value {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int k1 = solution.removeElement(nums1, val1);
        System.out.println("Number of elements not equal to " + val1 + ": " + k1);
        System.out.print("Modified array: ");
        for (int i = 0; i < k1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();
    }
    
}
=======
class Solution{
    public int removeElement(int[] nums,int val){
        int k=0;
        for(int i=0;i< nums.length;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}
public class remove_value {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int k1 = solution.removeElement(nums1, val1);
        System.out.println("Number of elements not equal to " + val1 + ": " + k1);
        System.out.print("Modified array: ");
        for (int i = 0; i < k1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();
    }
    
}
>>>>>>> 58624c13722277a53cfae4fcd995ede343182a21
