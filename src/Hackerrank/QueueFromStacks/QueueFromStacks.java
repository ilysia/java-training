package Hackerrank.QueueFromStacks;

import java.util.Stack;

public class QueueFromStacks {

    private Boolean inputMode                       = true;
    private final Stack<Integer> stack              = new Stack<>();
    private final Stack<Integer> reversedStack      = new Stack<>();

    public void print() {
        if (inputMode) {
            swapMode();
        }
        System.out.println(reversedStack.peek());
    }

    public void enqueue(Integer e) {
        if (!inputMode) {
            swapMode();
        }
        stack.push(e);
    }

    public void dequeue() {
        if (inputMode) {
            swapMode();
        }
        reversedStack.pop();
    }

    private void swapMode() {
        if (inputMode) {
            while(!stack.empty()) {
                reversedStack.push(stack.pop());
            }
        } else {
            while(!reversedStack.empty()) {
                stack.push(reversedStack.pop());
            }
        }
        inputMode = !inputMode;
    }

}
