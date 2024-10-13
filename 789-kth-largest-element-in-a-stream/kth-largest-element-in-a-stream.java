class KthLargest {
    int k=0;
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    public KthLargest(int k, int[] nums) {
        if(nums.length>k){
            for(int i=0;i<k;i++){
                pq.add(nums[i]);
            }
            for(int i=k;i<nums.length;i++){
                if(pq.peek() < nums[i]){
                    pq.poll();
                    pq.add(nums[i]);
                }
            }
        } else {
            for(int i=0;i<nums.length;i++){
                pq.add(nums[i]);
            }
        }
        this.k=k;
    }
    
    public int add(int val) {
        if (pq.size()<k) {
            pq.add(val);
        }
        else if(val > pq.peek()){
            pq.add(val);
            pq.poll();

        }  
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */