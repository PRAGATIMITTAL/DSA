class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int i=0;
        int sum =0;
        int maxSum=0;
        HashSet <Integer> set = new HashSet<>();
        for(int j=0; j<nums.length; j++){
            while (set.contains(nums[j])){
                set.remove(nums[i]);
                sum-=nums[i];
                i++;
            }
            set.add(nums[j]);
            sum+=nums[j];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}