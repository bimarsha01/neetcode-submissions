public class StockSpanner {
    private Stack<int[]> stack; // pair: [price, span]

    public StockSpanner() {
        stack = new Stack<>();
    }

    public int next(int price) {
       int span = 1; // at least today counts

        // keep merging while previous prices are <= current
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.peek()[1];
            stack.pop();
        }

        stack.push(new int[]{price, span});
        return span;
    }
}