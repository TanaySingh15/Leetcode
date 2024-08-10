class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] temp=new int[n+n];
        for(int i=0,j=0;i<n+n;i++){
            if(j==n) j=0;
            temp[i]=nums[j++];
        }
        int[] ans=new int[n+n];
        Stack<Integer> stack = new Stack<>();
        for(int i=n+n-1;i>=0;i--){
            while(!stack.isEmpty()){
                if(stack.peek()<=temp[i]) stack.pop();
                else {
                    ans[i]=stack.peek();
                    stack.push(temp[i]);
                    break;
                }
            }
            if(stack.isEmpty()){
                stack.push(temp[i]);
                ans[i]=-1;
            }
        }
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=ans[i];
        }
        return a;
    }
}