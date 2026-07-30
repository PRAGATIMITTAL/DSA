class Solution {
    public int maxProduct(int[] nums) {
        int minPr = nums[0];
        int maxPr = nums[0];
        int res = nums[0];
        for(int i=1; i<nums.length; i++){
            int v1= nums[i];
            int v2= maxPr *nums[i];
            int v3 = minPr*nums[i];
            minPr = Math.min(v1,Math.min(v2,v3));
            maxPr = Math.max(v1, Math.max(v2,v3));
            res = Math.max(res,Math.max(maxPr, minPr));
        }
        return res;
    }
}