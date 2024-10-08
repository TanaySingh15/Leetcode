class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int start = 0,max = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(charSet.contains(ch)){
                while(s.charAt(start)!=ch){
                    charSet.remove(s.charAt(start));
                    start++;
                }
                start++;
            }
            else{
                charSet.add(ch);
                max=Math.max(max,i-start+1);
            }
        }
        return max;
    }
}