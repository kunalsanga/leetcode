import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution{
    public int romanToInt(String s){
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V',5);
        romanMap.put('X', 10);
        romanMap.put('L',50);
        romanMap.put('C', 100);
        romanMap.put('D',500);
        romanMap.put('M', 1000);

        int total=0;
        int previousvalue=0;

        for(int i = s.length()-1; i>=0;i--){
            char currentChar=s.charAt(i);
            int currentValue =romanMap.get(currentChar);

            if(currentValue < previousvalue){
                total -= currentValue;
            }else{
                total += currentValue;
            }
    
            previousvalue = currentValue;
    
        }
        return total;

        
    }
}
public class roman_to_integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a roman number:");
        String rn = sc.nextLine();

        Solution sol = new Solution();
        int result = sol.romanToInt(rn);

        System.out.println("the integer value of roman numner is: "+result);

        sc.close();

    }
    
}
