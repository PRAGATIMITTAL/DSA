class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k<=1) return 0;
        int n = nums.length;
        int cnt=0;
        int product=1;
        int i=0;
        for(int j=0; j<n; j++){
            product *= nums[j];
            while (product>=k){
                product /= nums[i]; 
                i++;
            }
            cnt+= (j-i+1);
        }
        return cnt;
    }
}