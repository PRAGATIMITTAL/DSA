class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum = nums[0];
        int maxRes =nums[0];
        int minSum = nums[0];
        int minRes = nums[0];
        int res = nums[0];
        for(int i=1; i<nums.length;i++){
            int v1 = nums[i];
            int v2 = maxSum + nums[i];
            maxSum = Math.max(v1,v2);
            maxRes = Math.max(maxSum, maxRes);
            int v3 = nums[i];
            int v4 = minSum +nums[i];
            minSum = Math.min(v3,v4);
            minRes = Math.min(minSum, minRes);
        }
        res = Math.max(Math.abs(minRes), maxRes);
        return res;
    }
}