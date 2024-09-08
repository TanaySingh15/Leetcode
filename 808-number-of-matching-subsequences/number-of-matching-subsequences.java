class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        Map<String,Integer> map = new HashMap<>();
        for(String str:words){
            map.put(str,map.getOrDefault(str,0)+1);
        }

        int ans = 0;
        for(String str:map.keySet()){
            if(isSubSequence(str,s)){
                ans+=map.get(str);
            }
        }

        return ans;
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