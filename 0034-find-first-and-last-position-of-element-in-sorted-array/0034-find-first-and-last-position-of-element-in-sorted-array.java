class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int res=-1;
        int res1=-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target){
                res =mid;
                high=mid-1;
            }
            else if (nums[mid]<target) low= mid+1;
            else high=mid-1; 
        }
        low=0;
        high=nums.length-1;
        while(low<=high){
            int mid1 = low+(high-low)/2;
            if (nums[mid1]==target){
                res1=mid1;
                low=mid1+1;
            }
            else if(nums[mid1]<target) low=mid1+1;
            else high =mid1-1;
        }
        return new int[]{res,res1};
    }
}