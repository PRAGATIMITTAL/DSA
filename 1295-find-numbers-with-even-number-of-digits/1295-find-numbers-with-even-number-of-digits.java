class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0; i<nums.length; i++){
            int cnt=0;
            int digit = nums[i];
            while (digit>0){
                digit = digit/10;
                cnt++;
            }
            if(cnt%2==0){
                count++;
            }
            
        }
        return count;
    }
}