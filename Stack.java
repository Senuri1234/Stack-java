
	import java.util.EmptyStackException;

public class Stack {
    private int[] stackArray;
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    public Stack(int capacity) {
        this.capacity = capacity;
        stackArray = new int[capacity];
        top = -1;
    }

    // Method to push an element onto the stack
    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack overflow. Unable to push " + value);
            return;
        }
        stackArray[++top] = value;
        System.out.println("Pushed " + value + " onto the stack.");
    }

    // Method to pop an element from the stack
    public int pop() {
        if (top == -1) {
            throw new EmptyStackException();
        }
        int value = stackArray[top--];
        System.out.println("Popped " + value + " from the stack.");
        return value;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        
        // Uncommenting the next line will throw an EmptyStackException
        // stack.pop();
    }
}
