public class QueueUsingLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node front = null;
    static Node rear = null;

    // Insert at the rear
    static void enqueue(int value) {
        Node newNode = new Node(value);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println(value + " inserted into queue.");
    }

    // Remove from the front
    static void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println("Deleted: " + front.data);
            front = front.next;

            if (front == null) {
                rear = null;
            }
        }
    }

    // Display the queue
    static void display() {
        if (front == null) {
            System.out.println("Queue is empty!");
        } else {
            Node current = front;

            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);

        System.out.println("\nQueue elements:");
        display();

        dequeue();

        System.out.println("\nAfter dequeue:");
        display();
    }
}