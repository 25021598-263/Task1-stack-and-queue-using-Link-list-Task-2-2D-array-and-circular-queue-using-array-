//Name: Maryam awais 
//Roll no: 25021598-263
//Task: stack udnig linked list

class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; }
}

public class StackLinkedList {
    Node top;

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println(data + " pushed");
    }

    int pop() {
        if (top == null) {
            System.out.println("Stack Empty");
            return -1;
        }
        int val = top.data;
        top = top.next;
        return val;
    }

    void display() {
        Node temp = top;
        while (temp!= null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        StackLinkedList s = new StackLinkedList();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        System.out.println("Popped: " + s.pop());
        s.display();
    }
}
