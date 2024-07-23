class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        int i = 0;
        List<Integer> sub = new ArrayList<>();
        sub.add(1);
        ans.add(sub);
        while(i<numRows-1){
            int j = -1;
            sub = new ArrayList<>();
            int n = ans.get(i).size();
            for(int k=0;k<=n;k++,j++){
                if(j == -1) sub.add(ans.get(i).get(k));
                else if(k == n) sub.add(ans.get(i).get(j));
                else sub.add(ans.get(i).get(k)+ans.get(i).get(j));
            }
            ans.add(sub);
            i++;
        }
        return ans;
    }
}