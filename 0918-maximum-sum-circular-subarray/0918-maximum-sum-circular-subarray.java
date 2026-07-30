class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int sum = nums[0];
        int maxSum = nums[0];
        int minSum = nums[0];
        int res = nums[0];
        int maxRes = nums[0];
        int minRes = nums[0];
        for(int i=1; i<nums.length; i++){
            sum += nums[i];
            int v1= nums[i];
            int v2 = maxSum + nums[i];
            maxSum= Math.max(v1,v2);
            maxRes = Math.max(maxSum, maxRes);
            int v3= nums[i];
            int v4= minSum+nums[i];
            minSum = Math.min (v3,v4);
            minRes = Math.min(minSum,minRes);
        }
        if (maxRes<0) return maxRes;
        res = Math.max(maxRes, sum-minRes);
        return res;
    }
}