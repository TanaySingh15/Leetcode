class Solution {
    public int maxDepth(String s) {
        String open="{[(",close="}])";
        Stack<Character> stack=new Stack<>();
        int max = 0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(open.indexOf(ch)!=-1){
                stack.push(ch);
            }else if(close.indexOf(ch)!=-1){
                max=Math.max(max,stack.size());
                stack.pop();
            }
        }
        return max;
    }
}