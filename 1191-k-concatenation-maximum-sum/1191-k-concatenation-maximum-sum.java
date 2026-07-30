class Solution {
    public long kadane (int[] arr){
        long bestSum = arr[0];
        long res = arr[0];
        for(int i = 1; i<arr.length; i++){
            long v1 = arr[i];
            long v2 = bestSum +arr[i];
            bestSum = Math.max(v1,v2);
            res = Math.max(res, bestSum);
        }
        return Math.max(res,0);
    }
    public long kadaneoftwo (int [] arr){
        int [] copy = new int[arr.length*2];
        for (int i=0; i<arr.length*2; i++){
            copy [i] = arr [i%arr.length];
        }
        return kadane (copy);
    }
    public int kConcatenationMaxSum(int[] arr, int k) {
        long sum = 0;
        for (int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        long ans;
        if (k==1){
            ans = kadane(arr);
        } 
        else if (sum<=0){
            ans = kadaneoftwo(arr);
        } 
        else{
            ans = kadaneoftwo(arr) +(k-2)*sum;
        } 
        int MOD = 1000000007;
        return (int) (ans%MOD);
    }
}