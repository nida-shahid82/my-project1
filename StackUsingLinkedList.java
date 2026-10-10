public class StackUsingLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node top = null;

    // Insert at the top
    static void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;

        System.out.println(value + " pushed into stack.");
    }

    // Remove from the top
    static void pop() {
        if (top == null) {
            System.out.println("Stack is empty!");
        } else {
            System.out.println("Popped: " + top.data);
            top = top.next;
        }
    }

    // Show the top element
    static void peek() {
        if (top == null) {
            System.out.println("Stack is empty!");
        } else {
            System.out.println("Top element: " + top.data);
        }
    }

    // Display the stack
    static void display() {
        if (top == null) {
            System.out.println("Stack is empty!");
        } else {
            Node current = top;

            while (current != null) {
                System.out.println(current.data);
                current = current.next;
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