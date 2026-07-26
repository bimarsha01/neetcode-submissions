class MyQueue {
     Stack<Integer> stack;
      Stack<Integer> stack2;
    public MyQueue() {
         stack =  new Stack<>();
         stack2 = new Stack<>();
    }
    
   public void push(int x) {

        stack.push(x);
    }

    public int pop() {
        int size = stack.size();

        if (stack2.empty()) {
            for (int i = 0; i <= size - 1; i++) {
                stack2.push(stack.pop());
            }
        }
        return stack2.pop();
    }

    public int peek() {
        int size = stack.size();

        if (stack2.empty()) {
            for (int i = 0; i <= size - 1; i++) {
                stack2.push(stack.pop());
            }
        }
    return stack2.peek();
    }

    public boolean empty() {
        return stack.isEmpty() && stack2.isEmpty();
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