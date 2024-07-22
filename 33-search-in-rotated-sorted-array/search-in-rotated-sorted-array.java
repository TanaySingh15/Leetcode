class Solution {
    public int search(int[] nums, int target) {

        int n = nums.length;
        int h = n-1,l=0,m=0;

        while(l<=h){
            m=(l+h)/2;
            if(nums[m] == target){
                return m;
            }
            else if(nums[l] <= nums[m]){
                if(target >= nums[l] && target < nums[m]){
                    h=m-1;
                }
                else{
                    l=m+1;
                }
            }
            else {
                if(target<=nums[h] && target > nums[m]){
                    l=m+1;
                }
                else{
                    h=m-1;
                }
            }
            
        }
        return -1;
        
    }
}