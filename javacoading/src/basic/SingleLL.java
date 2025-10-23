package basic;

public class SingleLL {
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	Node head;
	
	// insert at end 
	public void insertAtEnd(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		Node current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}
	
	//insert at beginning
	public void insertAtBeginning(int data) {
		Node newNode = new Node(data);
			newNode.next = head;
			head = newNode;
	}
	
	//Delete a Node by Value
	
	public void deleteByValue(int value) {
		if(head == null) return;
		if(head.data==value) {
			head = head.next;
			return;
		}
		Node current =head;
		while(current.next != null && current.next.data != value) {
			current = current.next;
		}
		 if(current.next !=null) {
			 current.next = current.next.next;
		 }
	}
	
	//search a node
	public boolean search(int value) {
		Node current = head;
		while(current != null) {
			if(current.data == value)
				return true;
			current= current.next;
		}
		return false;
	}
	
	//Display the list
	public void Display() {
		Node current = head;
		while(current != null) {
			System.out.print(current.data + "->");
			current=current.next;
		}
		System.out.print("null");
	}
	
	//Reverse the linked list
	public void reverse() {
		Node prev = null;
		Node current = head;
		Node next;
		while(current != null) {
			next = current.next;
			current.next= prev;
			prev = current;
			current = next;
		}
		head = prev;
	}
	
	//main method for testing
	public static void main(String args[]) {
		SingleLL list = new SingleLL();
		list.insertAtEnd(10);
		list.insertAtEnd(20);
		list.insertAtBeginning(5);
		list.Display();
		System.out.println("Search 20"+list.search(20));
		System.out.println("Searcg 50"+list.search(50));
		list.reverse();
		list.Display();
	}

}
