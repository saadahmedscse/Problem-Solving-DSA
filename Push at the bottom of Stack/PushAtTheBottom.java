import java.util.Stack;

public class PushAtTheBottom{

    /** 
     * Created by Saad Ahmed on 26-March, 2022
     * This is a problem of stack where we have to push the item in bottom
    */

    /**
     * Function PushToBottom pushes a value at the bottom of the stack
     * @param stack is the stack we have declared
     * @param value is the value we want to push at the bottom
     */

    public static void pushAtBottom(Stack<Integer> stack, int value){
        if (stack.isEmpty()){
            stack.push(value);
            return;
        }

        int top = stack.pop();
        pushAtBottom(stack, value);
        stack.push(top);
    }

    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        pushAtBottom(stack, 5);

        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}