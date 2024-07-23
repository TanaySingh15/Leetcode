class Solution {
    public void sortColors(int[] nums) {
        int one = 0, three = nums.length-1;

        for(int two=0;two<=three;two++){
            if(nums[two]==0){
                int temp = nums[one];
                nums[one]=nums[two];
                nums[two]=temp;
                one++;
            }
            else if(nums[two]==2){
                int temp = nums[three];
                nums[three]=nums[two];
                nums[two] = temp;
                if(nums[two] == 0 || nums[two] == 2) two--;
                three--;
            }
        }
    }
}