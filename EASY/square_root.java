import java.util.Scanner;
class Solution{
    public int mysqrt(int x){
        if(x==0 || x==1){
            return x;
        }
        int left=0,right=x;

        int result=0;

        while(left<=right){
            int mid=left+(right-left)/2;

            if((long)mid*mid<=x){
                result=mid;
                left=mid+1;
            }else{
                right=mid-1;
            }


        }
        return result;

    }
}
public class square_root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        int input = sc.nextInt();
        Solution sol = new Solution();
        int op = sol.mysqrt(input);

        System.out.println("square roof is: "+op);

        sc.close();
        
    }
    
}
