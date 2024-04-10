//create Doubly LinkedList
	class DoublyLinkedList{
	Node head;
	class Node{
		int data;
		Node prev;
		Node next;
		Node(int d){
			data=d;
			prev=null;
			next=null;
		}
	}
		void insert(int new_data){
			Node new_node=new Node(new_data);
			new_node.next=head;
			new_node.prev=null;
			if(head != null )
				head.prev=new_node;
			head=new_node;
		}
		void display(Node n){
			Node p=null;
			System.out.println("forward printing");
			while(n != null ){
				System.out.print(n.data+"->");
				p=n;
				n=n.next;
			}
			System.out.println("------------------");
			System.out.println("backward printing");
			while(p != null ){
				System.out.print(p.data+"->");
				p=p.prev;
			}
		}

		public static void main(String[] args){
			DoublyLinkedList dl=new DoublyLinkedList();
			dl.insert(5);
			dl.insert(10);
			dl.insert(15);
			dl.insert(20);
			dl.display(dl.head);
		}
	}		