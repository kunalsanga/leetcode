#include<iostream>
#include<string>
using namespace std;
class Solution{
public:
    bool isValid(string s){
        int n = s.length();
        if (n<3) return false;

        int vowel=0,consonent=0;
        string vowel_set="aeiouAEIOU";

        for (char c:s){
            if(isalpha(c)){
                if(vowel_set.find(c) != string::npos){
                    vowel++;
                }else{
                    consonent++;
                }
            }else if(!isdigit(c)){
                return false;
            }

        }
        return vowel>=1 && consonent>=1;

    }

};

int main(){
    Solution sol;
    cout << boolalpha;

    cout << sol.isValid("234Adas") << endl;
    return 0;
}