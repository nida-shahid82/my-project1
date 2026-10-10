public class StackUsingArray {
    static int[] stack = new int[5];
    static int top = -1;

    // Insert an element
    static void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack is full!");
        } else {
            top++;
            stack[top] = value;
            System.out.println(value + " pushed into stack.");
        }
    }

    // Remove the top element
    static void pop() {
        if (top == -1) {
            System.out.println("Stack is empty!");
        } else {
            System.out.println("Popped: " + stack[top]);
            top--;
        }
    }

    // Show the top element
    static void peek() {
        if (top == -1) {
            System.out.println("Stack is empty!");
        } else {
            System.out.println("Top element: " + stack[top]);
        }
    }

    // Display all elements
    static void display() {
        if (top == -1) {
            System.out.println("Stack is empty!");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);

        System.out.println("\nStack elements:");
        display();

        peek();
        pop();

        System.out.println("\nAfter pop:");
        display();
    }
}