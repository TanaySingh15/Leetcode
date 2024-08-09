class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums1){
            set.add(i);
        }
        ArrayList<Integer> a=new ArrayList<>();
        for(int i:nums2){
            if(set.contains(i)){
                set.remove(i);
                a.add(i);
            }
        }
        int[] ans=new int[a.size()];
        int c=0;
        for(int i:a)
            ans[c++]=i;
        return ans;
    }
}