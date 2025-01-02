class Solution{
    public static boolean isplaindrome(int x){
        if(x<0){
            return false;
        }
        int rev=0;
        while(x!=0){
            int digit = x%10;