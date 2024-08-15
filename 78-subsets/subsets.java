class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        subset(nums,nums.length);
        return ans;
    }
    List<Integer> sub = new ArrayList<>();
    void subset(int[] num,int n){
        if(n==0){
            ans.add(new ArrayList<>(sub));
            return;
        }
        sub.add(num[n-1]);
        subset(num, n - 1);
        sub.remove(sub.size()-1);
        subset(num, n - 1);
    }
}