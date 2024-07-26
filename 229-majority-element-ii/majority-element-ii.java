class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1=0,count2=0,max1=0,max2=0;
        for(int i=0;i<nums.length;i++){
            if(count1==0 && nums[i]!=max2){
                count1 = 1;
                max1 = nums[i];
            }
            else if(count2==0 && nums[i]!=max1){
                count2 = 1;
                max2 = nums[i];
            }
            else if(max1 == nums[i]) count1++;
            else if(max2 == nums[i]) count2++;
            else {
                count1--;
                count2--;
            }
        }

        List<Integer> result = new ArrayList<>();
        int threshold = nums.length / 3; 

        count1 = 0;
        count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max1 == nums[i]) {
                count1++;
            } else if (max2 == nums[i]) {
                count2++;
            }
        }
        if (count1 > threshold) {
            result.add(max1);
        }
        if (count2 > threshold) {
            result.add(max2);
        }

        return result;
    }
}