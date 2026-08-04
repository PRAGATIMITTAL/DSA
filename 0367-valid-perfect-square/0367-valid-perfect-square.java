class Solution {
    public boolean isPerfectSquare(int num) {
        int low=0;
        int high=num;
        while(low<=high){
            long mid = low+(high-low)/2;
            long square=mid*mid;
            if (square==num) return true;
            else if(square<num) low = (int)mid+1;
            else high=(int)mid-1;
        }
        return false;
    }
}