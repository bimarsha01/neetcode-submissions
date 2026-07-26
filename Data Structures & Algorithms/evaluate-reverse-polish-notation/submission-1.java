class Solution {
    public int evalRPN(String[] tokens) {
         int i = 0;

        Stack<Integer> stack = new Stack<>();
        while(i<tokens.length){
            if(tokens[i].equals("+")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b+a);
            }
            else if(tokens[i].equals("-")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push( (b-a));
            } else if(tokens[i].equals("*")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b*a);
            }else if(tokens[i].equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b/a);
            }
            else
                stack.push(Integer.valueOf(tokens[i]));

            i++;
        }
        return stack.peek();
    }
}
