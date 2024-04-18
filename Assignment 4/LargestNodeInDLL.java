//Find the largest node in Doubly linked list in java
class LargestNodeInDLL {
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
	void largestNode(){
		if(head == null)
			return;
			
		Node largest = head;
		Node curr = head.next;
		while(curr != null){
			if(curr.data > largest.data)
				largest = curr;
			curr = curr.next;
		}
		
		System.out.println("Largest node: " + largest.data);
	}

		
    public static void main(String args[]) {
        LargestNodeInDLL list = new LargestNodeInDLL();
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
		list.largestNode();
    }
}

