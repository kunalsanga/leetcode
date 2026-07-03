class Solution {
public:
    bool isHappy(int n) {
        unordered_set<int> checked;
        checked.insert(n);
        while (true) {
            int copy = n;
            int sum = 0;
            while (copy) {
                sum += (copy % 10) * (copy % 10);
                copy /= 10;
            }
            if (sum == 1) {
                return true;
            } 
            if (checked.count(sum)) {
                return false;
            }
            n = sum;
            checked.insert(n);
        }
        return false;
    }
};