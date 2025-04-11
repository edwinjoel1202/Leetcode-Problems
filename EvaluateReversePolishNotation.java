import java.util.Stack;

public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            switch (token) {
                case "+":
                    int b1 = stack.pop();
                    int a1 = stack.pop();
                    stack.push(a1 + b1);
                    break;
                case "-":
                    int b2 = stack.pop();
                    int a2 = stack.pop();
                    stack.push(a2 - b2);
                    break;
                case "*":
                    int b3 = stack.pop();
                    int a3 = stack.pop();
                    stack.push(a3 * b3);
                    break;
                case "/":
                    int b4 = stack.pop();
                    int a4 = stack.pop();
                    stack.push(a4 / b4); // Note: Integer division
                    break;
                default:
                    // It's a number, push it onto the stack
                    stack.push(Integer.parseInt(token));
                    break;
            }
        }

        // The result will be the only element left in the stack
        return stack.pop();
    }
}