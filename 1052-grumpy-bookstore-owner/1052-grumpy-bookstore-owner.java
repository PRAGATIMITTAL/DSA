class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        int sum=0;
        int maxSum=0;
        int satisfied =0;

        for(int i=0; i<n; i++){
            if (grumpy[i] ==0){
                satisfied+=customers[i];
            }
        }
        //1+1+1+7+5+1
        for(int i=0; i<minutes;i++ ){
            if (grumpy[i] == 1 ){
                sum+=customers[i];
            }
        }
        maxSum = sum;
        for(int i=minutes;i<n;i++){
            if (grumpy[i] ==1){
                sum+=customers[i];
            }
            if (grumpy[i-minutes]==1){
                sum-=customers[i-minutes];
            }
            maxSum= Math.max(sum,maxSum);

        }
        return maxSum+ satisfied;
    }
}
