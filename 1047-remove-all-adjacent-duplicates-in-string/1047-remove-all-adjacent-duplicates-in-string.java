class Solution {
    public String removeDuplicates(String s) {
        Stack <Character> stack = new Stack<>();
        int n = s.length();
        for (int i=0; i< n; i++){
            if (!stack.isEmpty() && s.charAt(i)== stack.peek()){
                stack.pop();
            }
            else stack.push(s.charAt(i));
        }
        StringBuilder ans = new StringBuilder();
        while(!stack.isEmpty()){
            ans.append(stack.pop());
        }
        return ans.reverse().toString();
    }
}