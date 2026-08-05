class Solution {
    public int search(int[] nums, int target) {
        //part1- lower elements walarotated array
        //part2- higher elements wala array
        int low=0;
        int high= nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if (nums[mid]==target) return mid;
            if(nums[mid]>nums[high]){//mid part2
                if(target>nums[high]){//target part2
                    if (target>nums[mid]){
                        low =mid+1;
                    }
                    else high=mid-1;
                }
                else{//target part1 
                low=mid+1;
                }
            }
            else{
                //mid part1
                if(target>nums[high]){//target part2
                high = mid-1;
                }
                else {//target part1
                if(target>nums[mid]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
                }
            }
        }
        return -1;
    }
}