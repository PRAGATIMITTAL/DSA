class Solution {
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z0-9]", "");
        String res = result.toLowerCase();
        int i=0;
        int j = res.length()-1;
        while(i<j){
            if (res.charAt(i)!=res.charAt(j)){
                return false;
            }
            i++;
            j--;
            
        }
        return true;
    }
}