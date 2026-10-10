public class QueueUsingArray {
    static int[] queue = new int[5];
    static int front = 0;
    static int rear = -1;

    // Insert an element
    static void enqueue(int value) {
        if (rear == queue.length - 1) {
            System.out.println("Queue is full!");
        } else {
            rear++;
            queue[rear] = value;
            System.out.println(value + " inserted into queue.");
        }
    }

    // Remove the first element
    static void dequeue() {
        if (front > rear) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println("Deleted: " + queue[front]);
            front++;
        }
    }

    // Display the queue
    static void display() {
        if (front > rear) {
            System.out.println("Queue is empty!");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.println(queue[i]);
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