class MyStack {

    Queue<Integer> q;
    public MyStack() {
        q = new LinkedList<>();
    }
    
    public void push(int x) {
        q.offer(x);

        int size = q.size();

        for(int i = 0;i<size-1;i++){
            q.offer(q.poll());
        }
    }
    
    public int pop() {
        int a = q.poll();
        return a;
    }
    
    public int top() {
        int b = q.peek();
        return b;
    }
    
    public boolean empty() {
      boolean empt = q.isEmpty();
      return empt;
    }
}
