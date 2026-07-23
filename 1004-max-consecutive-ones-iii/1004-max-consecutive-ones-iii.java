class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int cnt=0;
        int max =0;
        int i=0;
        for(int j=0; j<n ;j++){
            if (nums[j]==0){
                cnt++;
            }
            while (cnt>k){
                if (nums[i]==0) cnt--;
                i++;
            }
            max = Math.max(max,j-i+1);
        }
        return max;
    }
}