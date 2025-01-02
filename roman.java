class Solution {
    public int romantoint(String str) {
        String[] s = {"M", "D", "C", "L", "X", "V", "I"};
        int[] n = {1000, 500, 100, 50, 10, 5, 1};
        int i =0;
        int num = new int();
        while (str>0){
            if (str=s[i]){
                num=num+n[i];
                str-=s[i];
            } else{
                i++;
            }
        }
        return int;
    }
}

public class roman {
    public static void main(String[] args) {
        Solution s = new Solution();
        String s ="XI";
        String r=s.intToRoman(s);
        System.out.println("roman  "+r);

    }
    
}
