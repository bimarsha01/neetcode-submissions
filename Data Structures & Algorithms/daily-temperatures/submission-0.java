class Solution {
    public int[] dailyTemperatures(int[] arr) {
           int[] res = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                int prevIndex = stack.pop();
                res[prevIndex] = i - prevIndex;
            }

            stack.push(i);
        }

        return res; 
    }
}
