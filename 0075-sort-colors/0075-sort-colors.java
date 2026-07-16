class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int m = 0;
        int h = nums.length-1;
        while(m<=h){
            if(nums[m]==0) {
                int temp = nums[i];
                nums[i] = nums[m];
                nums[m] = temp;
                m++;
                i++;
            } 
            else if(nums[m]==1){
                m++;
            }
            else {
                int temp = nums[m];
                nums[m] = nums[h];
                nums[h]= temp;
                h--;
            }
            
        }
    }
}