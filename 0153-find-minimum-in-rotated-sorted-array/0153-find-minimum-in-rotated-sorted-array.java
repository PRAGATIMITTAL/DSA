class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high = nums.length-1;
        while(low<high){
            if(nums[low]<nums[high]){//agar acurrent search space  array already sorted hai to minimum element index 0 pe hi hoga
                return nums[low];
            }
            int mid = low+(high-low)/2;
            if(nums[mid]>nums[high]){
                //mid part 2
                low=mid+1;
            }
            else {
                //mid part1
                high=mid;
            }
        }
        return nums[low];
    }
}