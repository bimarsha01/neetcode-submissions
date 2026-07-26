class Solution {
    public int calPoints(String[] arr) {

        Stack<Integer> stack = new Stack<>();
        int count = 0;

        for(String token : arr){

            if(token.equals("+")){

                int a = stack.pop();
                int b = stack.peek();
                int sum = a + b;

                stack.push(a);
                stack.push(sum);

                count += sum;
            }

            else if(token.equals("C")){

                int removed = stack.pop();
                count -= removed;
            }

            else if(token.equals("D")){

                int doubled = 2 * stack.peek();
                stack.push(doubled);
                count += doubled;
            }

            else{

                int value = Integer.parseInt(token);
                stack.push(value);
                count += value;
            }
        }

        return count;
    }
}