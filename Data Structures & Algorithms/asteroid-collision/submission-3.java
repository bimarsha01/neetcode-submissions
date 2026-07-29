class Solution {
    public int[] asteroidCollision(int[] asteroids) {
         Stack<Integer> stack = new Stack<>();

        for (int a : asteroids) {

            boolean destroyed = false;

            while (!stack.isEmpty() && a < 0 && stack.peek() > 0) {

                int top = stack.peek();

                if (Math.abs(a) > top) {
                    stack.pop();
                    continue;
                }
                else if (Math.abs(a) == top) {
                    stack.pop();
                }

                destroyed = true;
                break;
            }

            if (!destroyed) {
                stack.push(a);
            }
        }

        int[] arr = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            arr[i] = stack.get(i);
        }

        return arr;
    }
}