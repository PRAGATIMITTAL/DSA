class Solution {
    public int maxArea(int[] height) {
        int maxAr=0;
        int l = 0;
        int r= height.length-1;
        while(l<r){
            int width= r-l;
            int length = Math.min(height[l], height[r]);
            int area = width*length;
            if (height[l]<height[r]) l++;
            else r--;
            maxAr = Math.max(area, maxAr);
        }
        return maxAr;


    }
}