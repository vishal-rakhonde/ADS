//Reverse a Doubly Linked List in java

class DoublyLinkedListReverse {
    Node head;

    static class Node {
        int data;
        Node next, prev;

        Node(int d) {
            data = d;
            next = null;
            prev = null;
        }
    }

    void reverse() {
        Node temp = null;
        Node current = head;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if (temp != null) {
            head = temp.prev;
        }
    }

    void display() {
        Node last = null;
        System.out.println("Reverse direction:");
        while (head != null) {
            System.out.print(head.data + "---> ");
            last = head;
            head = head.next;
        }
        System.out.println();
        System.out.println("------------------------------");
        System.out.println();
        System.out.println("Forward direction:");
        while (last != null) {
            System.out.print(last.data + "-> ");
            last = last.prev;
        }
    }

    public static void main(String args[]) {
        DoublyLinkedListReverse d = new DoublyLinkedListReverse();
        d.head = new Node(10);
        d.head.next = new Node(20);
        d.head.next.prev = d.head;
        d.head.next.next = new Node(30);
        d.head.next.next.prev = d.head.next;
        d.head.next.next.next = new Node(40);
        d.head.next.next.next.prev = d.head.next.next;
        d.head.next.next.next.next = new Node(50);
        d.head.next.next.next.next.prev = d.head.next.next.next;
        d.head.next.next.next.next.next = new Node(60);
        d.head.next.next.next.next.next.prev = d.head.next.next.next.next;
        
        d.display();
        System.out.println();
        d.reverse();
        d.display();
    }
}
