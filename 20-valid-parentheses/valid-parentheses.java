class Solution {
    public boolean isValid(String s) {
        String open="{[(",close="}])";
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(open.indexOf(ch)!=-1){
                stack.push(ch);
            }else {
                if(stack.isEmpty()) return false;
                if(stack.peek()!=open.charAt(close.indexOf(ch))) return false;
                else stack.pop();
            }
        }
        return stack.isEmpty();
    }
}