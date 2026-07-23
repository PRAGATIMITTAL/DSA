class Solution {
    public int longestSubarray(int[] nums) {
        int n= nums.length;
        int max=0;
        int cnt =0;

        int i=0;
        for(int j=0; j<n; j++){
            if(nums[j]==0){
                cnt++;
            }
            if (cnt>1){
                if (nums[i]==0) cnt--;
                i++;
            }
            max = Math.max(max,j-i);
        }
        return max;
    }
}