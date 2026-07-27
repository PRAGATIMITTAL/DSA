class Solution {
    public int findMaxLength(int[] nums) {
        int zero=0;
        int one =0;
        int max=0;
        HashMap <Integer, Integer> map = new HashMap <>();
        map.put(0,-1);
        for(int i=0; i<nums.length; i++){
            if (nums[i]==0) zero++;
            else one++;
            if(map.containsKey(zero-one)){
                max = Math.max(max, i-map.get(zero-one));
            }
            map.put(zero-one, map.getOrDefault(zero-one,i));
        }
        return max;
    }
}