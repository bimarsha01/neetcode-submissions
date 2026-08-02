class FreqStack {
    private HashMap<Integer , Integer> freq ;
      private  HashMap<Integer , Stack<Integer>> hashmap ;
        private int maxCnt;

    public FreqStack() {
       freq = new HashMap<>();
       hashmap = new HashMap<>();
       maxCnt = 0;
    }
    
    public void push(int val) {
        int valCnt = freq.getOrDefault(val, 0) +1;
        freq.put(val, valCnt);
        if(valCnt > maxCnt) {
            maxCnt = valCnt;
            hashmap.putIfAbsent(valCnt, new Stack<>());
        }
        hashmap.get(valCnt).push(val);
    }
    
    public int pop() {
        int res = hashmap.get(maxCnt).pop();
        freq.put(res , freq.get(res)-1);
        if(hashmap.get(maxCnt).isEmpty()){
            maxCnt--;
        }
        
        return res;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */