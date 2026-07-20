class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        if(n<0){
            return 0.0000;
        }
        double maxSum = Integer.MIN_VALUE;
        double sum = 0.0000;
        for(int i=0;i<k; i++ ){
            sum +=nums[i];
        }
        maxSum = sum;
        for(int i=k; i<n;i++){
            sum= sum+nums[i]-nums[i-k];
            maxSum = Math.max(maxSum, sum);
        }
        return (maxSum/k);
    }
}