class Solution {
    public int removeElement(int[] nums, int val) {
        int[] ans = new int[nums.length];
        int k = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val) ans[k++]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(ans[i]+" ");
            nums[i]=ans[i];
        }
        return k;
    }
}