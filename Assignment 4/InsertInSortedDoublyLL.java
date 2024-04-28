//Insert value in sorted way in a sorted doubly linked list in java
class LengthOfDoublyLinkedList {
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

    void display() {
        Node current = head;
        System.out.println("Forward direction:");
        while (current != null) {
            System.out.print(current.data + "---> ");
            current = current.next;
        }
        System.out.println();
        System.out.println("------------------------------");
    }
	void insertElement(int new_data){
		if(head == null)
			return;
		
		

		
    public static void main(String args[]) {
        LengthOfDoublyLinkedList list = new LengthOfDoublyLinkedList();
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.prev = list.head;
        list.head.next.next = new Node(30);
        list.head.next.next.prev = list.head.next;
        list.head.next.next.next = new Node(40);
        list.head.next.next.next.prev = list.head.next.next;
        list.head.next.next.next.next = new Node(50);
        list.head.next.next.next.next.prev = list.head.next.next.next;

        list.display();
		list.lengthoflist();
    }
}

