// Name: Maryam awais
// Roll no: 25021598-263
// Task: Circular Queue using Array

public class CircularQueueArray {
    int[] queue = new int[5];
    int front = -1, rear = -1;

    void enqueue(int value) {
        if ((rear + 1) % 5 == front) {
            System.out.println("Queue is Full");
        } else {
            if (front == -1) front = 0;
            rear = (rear + 1) % 5;
            queue[rear] = value;
        }
    }

    void dequeue() {
        if (front == -1) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Deleted: " + queue[front]);
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % 5;
            }
        }
    }

    void display() {
        if (front == -1) {
            System.out.println("Queue Empty");
        } else {
            System.out.print("Queue: ");
            int i = front;
            while (true) {
                System.out.print(queue[i] + " ");
                if (i == rear) break;
                i = (i + 1) % 5;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CircularQueueArray q = new CircularQueueArray();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.display();
    }
}
