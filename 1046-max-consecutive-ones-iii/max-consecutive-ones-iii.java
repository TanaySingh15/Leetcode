class Solution {
    public int longestOnes(int[] nums, int k) {
       int j=0;
        int n=nums.length;
        int max=0,curr=0;
        int currentZeros = 0;
        for(int i=0;i<n;i++){
            if(nums[i]==0) {
                currentZeros++;
            }
            if(currentZeros>k){
                while(currentZeros>k){
                    if(nums[j]==0){
                        currentZeros--;
                    }
                    curr--;
                    j++;
                }
            }
            curr++;
            if(max<curr) max=curr;
        }
        return max;
    }
}