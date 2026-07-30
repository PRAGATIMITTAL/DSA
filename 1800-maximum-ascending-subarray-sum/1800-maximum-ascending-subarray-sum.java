class Solution {
    public int maxAscendingSum(int[] nums) {
        int currSum =nums[0];
        int maxSum=nums[0];
        for(int j=1; j<nums.length; j++){
            if (nums[j]>nums[j-1]){
                currSum +=nums[j];
            }
            else {
                currSum = nums[j];
            }
            maxSum = Math.max(maxSum, currSum);
        } 
        return maxSum;
    }
}