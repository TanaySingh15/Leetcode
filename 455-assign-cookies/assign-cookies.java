class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int j = s.length-1,ans=0;
        for(int i=g.length-1;i>-1;i--){
            if(j==-1) return ans;
            if(g[i]<=s[j]){
                ans++;
                j--;
            }
        }
        return ans;
    }
}