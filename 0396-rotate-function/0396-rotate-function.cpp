class Solution {
public:
    int maxRotateFunction(vector<int>& nums) {
        int n = nums.size();
        long long int totalSum = 0;
        long long int currSum = 0;

        for(int i = 0; i < n; i++){
            totalSum += nums[i];
            currSum += i * nums[i];
        }

        long long int maxSum = currSum;

        for(int i = 1; i < n; i++){
            currSum = currSum + totalSum - n * nums[n-i];
            maxSum = max(maxSum , currSum);
        }

        return maxSum;
    }
};