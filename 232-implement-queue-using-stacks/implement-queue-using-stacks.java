class MyQueue {
    Stack<Integer> stk;
    public MyQueue() {
        stk = new Stack<>();
    }
    
    public void push(int x) {
        stk.push(x);
    }
    
    public int pop() {
        Stack<Integer> stk1 = new Stack<>();
        int res=0,n=stk.size();
        for(int i=0;i<n-1;i++){
            stk1.push(stk.pop());
        }
        res=stk.pop();
        while(!stk1.isEmpty()){
            stk.push(stk1.pop());
        }
        return res;
    }
    
    public int peek() {
        Stack<Integer> stk1 = new Stack<>();
        int res=0,n=stk.size();
        for(int i=0;i<n;i++){
            res=stk.pop();
            stk1.push(res);
        }
        while(!stk1.isEmpty()){
            stk.push(stk1.pop());
        }
        return res;
    }
    
    public boolean empty() {
        return stk.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */