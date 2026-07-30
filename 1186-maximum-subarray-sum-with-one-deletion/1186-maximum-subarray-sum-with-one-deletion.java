class Solution {
    public int maximumSum(int[] arr) {
        int nodelete = arr[0];
        int onedelete = 0;
        int res = arr[0];
        for(int i=1; i<arr.length; i++){
            int prevnodelete = nodelete;
            int v1 = arr[i];
            int v2 = nodelete +arr[i];
            nodelete = Math.max(v1,v2);
            int v3 = prevnodelete;
            int v4 = onedelete + arr[i];
            onedelete = Math.max(v3,v4);
            res = Math.max(res,Math.max(onedelete, nodelete));
        }
        return res;
    }
}