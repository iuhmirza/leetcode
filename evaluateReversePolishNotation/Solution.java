package evaluateReversePolishNotation;

import java.util.ArrayDeque;

public class Solution {

    public int evalRPN(String[] tokens) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int size = tokens.length;
        String token;
        int op1;
        int op2;
        for (int i = 0; i < size; i++) {
            token = tokens[i];
            switch (token) {
                case "+":
                    op2 = stack.pop();
                    op1 = stack.pop();
                    stack.push(op1 + op2);
                    break;
                case "-":
                    op2 = stack.pop();
                    op1 = stack.pop();
                    stack.push(op1 - op2);
                    break;
                case "*":
                    op2 = stack.pop();
                    op1 = stack.pop();
                    stack.push(op1 * op2);
                    break;
                case "/":
                    op2 = stack.pop();
                    op1 = stack.pop();
                    stack.push(op1 / op2);
                    break;
                default:
                    stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}

