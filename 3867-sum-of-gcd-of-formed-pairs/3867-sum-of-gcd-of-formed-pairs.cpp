class Solution {
public:
    long long gcdSum(vector<int>& nums) {
        int n = nums.size();
        vector<int> preGcd(n);
        int maxVal = 0;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] > maxVal) {
                maxVal = nums[i];
            }
            preGcd[i] = std::gcd(nums[i], maxVal);
        }
        
        sort(preGcd.begin(), preGcd.end());
        
        long long sum = 0;
        int l = 0, r = n - 1;
        
        while (l < r) {
            sum += std::gcd(preGcd[l], preGcd[r]);
            l++;
            r--;
        }
        
        return sum;
    }
};