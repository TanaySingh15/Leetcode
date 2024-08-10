class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans= new ArrayList<>();
        String push = "Push",pop="Pop";
        int top=0,len=target.length;
        int i = 0;
        for(int j=1;j<=n;j++){
            if(i==len)break;
            ans.add(push);
            if(target[i]!=j){
                ans.add(pop);
            } else{
                i++;
            }
        }
        return ans;
    }
}