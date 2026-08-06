class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        while(low<high){
            int mid = low+(high-low)/2;
            if (nums[mid]==nums[high]) high--;
            else if (nums[mid]>nums[high]){//mid part 2
                low=mid+1;
            }
            else{//mid part1
                high=mid;
            }
        }
        return nums[low];
    }
}