class MyStack {
    Queue<Integer> q;
    public MyStack() {
        q=new LinkedList<>();
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        Queue<Integer> q2 = new LinkedList<>();
        int res = 0,n=q.size();
        for(int i=0;i<n-1;i++){
            q2.add(q.remove());
        }
        res = q.remove();
        while(!q2.isEmpty()){
            q.add(q2.remove());
        }
        return res;
    }
    
    public int top() {
        int res = pop();
        q.add(res);
        return res;
    }
    
    public boolean empty() {
        return q.size()==0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */