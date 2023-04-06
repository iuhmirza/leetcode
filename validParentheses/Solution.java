package validParentheses;

import java.util.ArrayDeque;

public class Solution {
    public boolean isValid(String s) {
        int size = s.length();
        if (size % 2 != 0) return false;
        char ch;
        ArrayDeque<Character> stack = new ArrayDeque<>(size);
        for (int i = 0; i < size; i++) {
            ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.size() == 0) return false;
                switch (stack.pop()) {
                    case '(':
                        if (ch != ')') return false;
                        break;
                    case '{':
                        if (ch != '}') return false;
                        break;
                    case '[':
                        if (ch != ']') return false;
                        break;
                }
            }
        }
        return stack.size() == 0;
    }
}
