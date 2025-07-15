class Solution:
    def isValid(self, s: str) -> bool:
        if len(s) < 3:
            return False
        
        vowel=0
        consonent=0
        vowel_set="aeiouAEIOU"

        for c in s:
            if c.isalpha():
                if c in vowel_set:
                    vowel +=1
                else:
                    consonent +=1

            elif not c.isdigit():
                return False
    
        return vowel>=1 and consonent>=1

sol = Solution()
print(sol.isValid("234Adas"))