class Solution {
    public int maxSum(int [] nums , int l, int m){
        int n = nums.length;
        int [] prefix = new int [n+1];
        for(int i=0; i<n;i++){
            prefix[i+1] = prefix[i]+nums[i];
        }
        int bestL = prefix[l]- prefix[0];
        int ans =0;
        for(int i=l+m; i<=n; i++){
            int currentL = prefix[i-m]- prefix[i-m-l];
            bestL = Math.max(currentL, bestL);
            int currentM = prefix[i]- prefix[i-m];
            ans = Math.max(ans, bestL+currentM);
        }
        return ans;
    }
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        return Math.max(maxSum(nums,firstLen , secondLen), maxSum(nums,secondLen, firstLen));
    }

}