import java.util.Stack;

public class StackReverse{

    public static void pushToBottom(Stack<Integer> stack, int value){
        if (stack.isEmpty()){
            stack.push(value);
            return;
        }

        int top = stack.pop();
        pushToBottom(stack, value);
        stack.push(top);
    }

    public static void reverseStack(Stack<Integer> stack){
        if (stack.isEmpty()){
            return;
        }

        int top = stack.pop();
        reverseStack(stack);
        pushToBottom(stack, top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        reverseStack(stack);

        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}