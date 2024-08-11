class Solution {
    public String largestOddNumber(String num) {
        for(int i=num.length()-1;i>-1;i--){
            char ch = num.charAt(i);
            int n = ch - '0';
            if(n%2!=0) return num.substring(0,i+1);
        }
        return "";
    }
}