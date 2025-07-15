class Solution{
    public boolean isValid(String s){
        int n = s.length();
        if(n<3){
            return false;
        }

        int vowel=0,consonent=0;
        for(char c:s.toCharArray()){
            if(Character.isLetter(c)){
                if("aeiouAEIOU".indexOf(c) !=-1){
                    vowel++;
                }else{
                    consonent++;
                }
            }else if(!Character.isDigit(c)){
                return false;
                
            }
        }
        return vowel>=1 && consonent>=1;

    }
    
}
public class validstring {
    public static void main(String[] args){
        Solution sol = new Solution();
        System.out.println(sol.isValid("234Adas"));
    }
    
}
