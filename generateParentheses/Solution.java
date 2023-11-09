package generateParentheses;

import java.lang.StringBuilder;
import java.util.ArrayList;

import java.util.List;

class Solution {
    ArrayList<String> list;
    StringBuilder sb;
    int num;

    public List<String> generateParenthesis(int n) {
        list = new ArrayList<>();
        sb = new StringBuilder();
        num = n;
        backtrack(0, 0);
        return list;
    }

    public void backtrack(int open, int closed) {
        if (open == closed && closed == num) {
            list.add(sb.toString());
            return;
        }

        if (open < num) {
            sb.append("(");
            backtrack(open + 1, closed);
            sb.deleteCharAt(sb.length() - 1);
        }

        if (closed < open) {
            sb.append(")");
            backtrack(open, closed + 1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}