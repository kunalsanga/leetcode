import java.util.Scanner;
class Solution{
    public int reverse(int x){
        int rev=0;
        while(x!=0){
            int d = x %10;
            x/=10;

            if(rev>Integer.MAX_VALUE/10 || (rev==Integer.MAX_VALUE/10 && d>7)){
                return 0;
            }
            if(rev<Integer.MIN_VALUE/10 || (rev==Integer.MIN_VALUE/10 && d<8)){
                return 0;
            }
            rev = rev * 10 + d;
        }

        return rev;

    }
}
public class reverse_int {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enetr a number:");
        int input = sc.nextInt();

        Solution sol = new Solution();
        int result = sol.reverse(input);

        System.out.println("reversed integer :"+result);

        sc.close();


        
    }
    
}
