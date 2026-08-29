class Solution {
    public String removeStars(String s) {
        Stack <Character> sb = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if (s.charAt(i)=='*') sb.pop();
            else sb.push(s.charAt(i));
        }
        
        StringBuilder sb1 = new StringBuilder ();
        for(Character ch : sb){
            sb1.append(ch);
        }
        return sb1.toString();
    }
}