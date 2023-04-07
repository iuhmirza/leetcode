package minStack;

import java.util.ArrayList;
public class MinStack {
    ArrayList<Node> stack;
    Node min;

    class Node {
        int value;
        Node nextMin;

        public Node(int v) {
            value = v;
        }
    }

    public MinStack() {
        stack = new ArrayList<>();
    }

    public void push(int val) {
        Node N = new Node(val);
        stack.add(N);
        if (min == null) {
            min = N;
        }
        if (N.value < min.value) {
            N.nextMin = min;
            min = N;
        }
    }

    public void pop() {
        Node N = stack.remove(stack.size()-1);
        if (N.equals(min)) {
            min = N.nextMin;
        }
    }

    public int top() {
        return stack.get(stack.size()-1).value;
    }

    public int getMin() {
        return min.value;
    }
}
