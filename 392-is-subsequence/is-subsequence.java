class Solution {
    public boolean isSubsequence(String s, String t) {
        return isSubSequence(s,t);
    }

    boolean isSubSequence(String A, String B){
        int j = 0;
        if(A.length() > B.length()) return false;
        if(A.length() == B.length()){
            if(A.equals(B)) return true;
            else return false;
        }
        if(A.length() == 0 || B.length() == 0) return true;
        for(int i=0;i<B.length();i++){
            char ch = B.charAt(i);
            if(ch == A.charAt(j)) {
                j++;
                if(j==A.length()) return true;
            }
        }
        return false;
    }
}