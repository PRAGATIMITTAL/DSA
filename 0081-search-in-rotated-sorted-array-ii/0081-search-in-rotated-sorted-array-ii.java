class Solution {
    public boolean search(int[] nums, int target) {
        int low =0;
        int high = nums.length-1;
        while(low<=high){
            int mid= low+(high-low)/2;
            if(nums[mid]==target) return true;

            if (nums[mid]==nums[high]) high--;//duplicate value agar hai toh htane mei koi prblm nhi hai because target ke same to vaise bhi nnhi hai
            else if(nums[mid]>nums[high]){
                //mid part2
                if(target>nums[high]){//target part2
                    if(nums[mid]>target){
                        high=mid-1;
                    }
                    else low=mid+1;
                }
                else low=mid+1;//target part1
            }
            else {//mid part 1
                if (target>nums[high]){//target part2
                    high = mid-1;
                }
                else {//target part1
                    if(nums[mid]>target){
                        high=mid-1;
                    }
                    else low=mid+1;
                }

            }
        }
        return false;
    }
}