class Solution {
    public int maxSubArray(int[] nums) {
        int bestArray = nums[0];
        int res = nums[0];
        for(int i=1; i<nums.length; i++){
            int v1= bestArray+nums[i];
            int v2 = nums[i];
            bestArray = Math.max(v1,v2);
            res = Math.max(res,bestArray);
        }
        return res;
    }
}