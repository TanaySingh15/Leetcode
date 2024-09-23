class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans = new int[m+n];
        int i=0,j=0,k=0;
        while(i<n&&j<m){
            if(nums1[j]<=nums2[i]){
                ans[k++] = nums1[j];
                j++;
            }
            else {
                ans[k++] = nums2[i];
                i++;
            }
        }
        while(i<n){
            ans[k++] = nums2[i];
                i++;
        }
        while(j<m){
            ans[k++] = nums1[j];
            j++;
        }
        for(i=0;i<(m+n);i++){
            nums1[i]=ans[i];
        }
    }
}