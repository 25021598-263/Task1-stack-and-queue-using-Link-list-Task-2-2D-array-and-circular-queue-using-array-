//Name: Maryam awais 
//Roll no: 25021598-263
//Task: Queue using Linked List
class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; }
}

public class QueueLinkedList {
    Node front, rear;

    void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println(data + " enqueued");
    }

    int dequeue() {
        if (front == null) {
            System.out.println("Queue Empty");
            return -1;
        }
        int val = front.data;
        front = front.next;
        if (front == null) rear = null;
        return val;
    }

    void display() {
        Node temp = front;
        while (temp!= null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        QueueLinkedList q = new QueueLinkedList();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        System.out.println("Dequeued: " + q.dequeue());
        q.display();
    }
}
