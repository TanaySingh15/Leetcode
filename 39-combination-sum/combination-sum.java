class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        sum(candidates,target,candidates.length,ans,sub);
        return ans;
    }
    void sum(int[] arr,int target,int n,List<List<Integer>> ans,List<Integer> sub){
        if(target == 0){
            ans.add(new ArrayList<>(sub));
            return;
        }
        if(target<0 || n==0) return;
        int element = arr[n-1];
        if(element<=target){
            sub.add(element);
            sum(arr,target-element,n,ans,sub);
            sub.remove(sub.size()-1);
        }
        sum(arr,target,n-1,ans,sub);
    }
}