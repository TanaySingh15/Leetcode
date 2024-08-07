class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        if(strs.length==1) return strs[0];
        String pre = prefix(strs[0],strs[1]);
        for(int i=2;i<strs.length;i++){
            pre = prefix(strs[i],pre);
        }
        return pre;
    }

    static String prefix(String a,String b){
        int i=0;
        String ans="";
        if(b.length()==0 || a.length()==0) return "";
        while(a.charAt(i)==b.charAt(i)){
            ans = ans+a.charAt(i);
            i++;
            if(i==a.length() || i==b.length()) break;
        }
        return ans;
    }
}