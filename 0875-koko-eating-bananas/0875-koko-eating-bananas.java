class Solution {
    public boolean func(int [] piles, int h, int k){
        int hours =0;
        for(int i=0; i<piles.length; i++){
            hours += piles[i]/k;
            if (piles[i] % k!=0) hours= hours+1;
        }
        return(hours<=h);
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high =0;
        for(int i=0; i<piles.length;i++){
            high = Math.max(high,piles[i]);
        }
        while(low<high){
            int mid = low+(high-low)/2;
            if( func(piles, h, mid)){
                high=mid;
            }
            else {
                low=mid+1;
            }
        }
        return low;
    }
}