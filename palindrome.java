class Solution{
    public static boolean isplaindrome(int x){
        if(x<0){
            return false;
        }
        int original=x;//storing real of x in original 
        int rev=0;
        while(x!=0){
            int digit = x%10;
            rev=rev*10+digit;
            x/=10;
        }
        return original == rev;

    }
}
public class palindrome {
    public static void main(String[] args) {
        int x=121;
        if(Solution.isplaindrome(x)){
            System.out.println(x+ " is a plaindrome.");
        }else{
            System.out.println(x+"not a plaindrome");
        }
    }
    
}
