package LinkedListTutorials;

public class LinkedList {
	public static class Node{
		int data;
		Node next;
		public Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	public static Node head;
	public static Node tail;
	public static int size;
	
		//methods
		//add
		//remove
		//print
		//search
		
		public void addFirst(int data) {
			// step 1 = create new node
			Node newNode = new Node(data);
			size++;
			if(head == null) {
				head = tail = newNode;
				return;
			}
			//step 2 - newNode next = head
			newNode.next = head;
			//step 3 - head = newNode
			head = newNode;
		}
		
		public void addLast(int data) {
			Node newNode = new Node(data);
			size++;
			if(head == null) {
				head=tail=newNode;
				return;
			}
			// point last node next to newNode
			tail.next = newNode;
			tail = newNode;
		}
		
		public void print() {
			if(head == null) {
				System.out.println("Linked List is Empty");
				return;
			}
			Node temp = head;
			System.out.print("linked List data is ");
			while(temp != null) {
				System.out.print(temp.data+"-> ");
				temp= temp.next;
			}
			System.out.println("null");
			
		}
		//Add node at specific index point
		public void add(int idx, int data) {
			if(idx==0) {
				addFirst(data);
				return;
			}
			Node newNode = new Node(data);
			size++;
			Node temp = head;
			int i=0;
			while(i<idx-1) {
				temp = temp.next;
				i++;
			}
			newNode.next=temp.next;
			temp.next=newNode;
		}
		
		//remove node at First index
		public int removeFirst() {
			if(size==0) {
				System.out.println("Linked List is Empty");
				return Integer.MIN_VALUE;
			} else if(size==1) {
				int val=head.data;
				head=tail=null;
				size=0;
				return val;
			}
			int val=head.data;
			head=head.next;
			size--;
			return val;
		}
		
		//remove node at last index
		public int removeLast() {
			if(size==0) {
				System.out.println("Linked List is Empty");
				return Integer.MIN_VALUE;
			} else if(size==1) {
				int val=tail.data;
				head=tail=null;
				size=0;
				return val;
			}
			int val=tail.data;
			
			Node prev = head;
			for(int i=0;i<size-2;i++) {
				prev=prev.next;
			}
			prev.next=null;
			tail=prev;
			size--;
			return val;
		}
		
		//search key in linkedlist
		public int itrSearch(int key) {
			Node temp=head;
			int index=0;
			while(temp !=null) {
				if(temp.data==key) {
					return index;
				}
				index++;
				temp=temp.next;
			}
			return Integer.MIN_VALUE;
		}
		
		//helper function for recursion
		public int helper(Node head, int key) {
			if(head==null) {
				return -1;
			}
			if(head.data == key) {
				return 0;
			}
			int idx = helper(head.next, key);
			if(idx == -1) {
				return -1;
			}
			
			return idx+1;
		}
		
		//search key using recursion
		public int recSearch(int key) {
			return helper(head, key);
		}
		
		
		//Reverse LinkedList
		public void reverse() {
			Node prev = null;
			Node curr = tail = head;
			Node next;
			while(curr != null) {
				next=curr.next;
				curr.next=prev;
				prev=curr;
				curr=next;
			}
			head=prev;
			
		}
		
		//delete nth node from last
		public void deleteNthfromEnd(int n) {
			//calculate size of linked list
			int sz=0;
			Node temp = head;
			while(temp != null) {
				temp = temp.next;
				sz++;
			}
			
			if(n==sz) {
				head= head.next;
				return;
			}
			
			//find prev of index(index from last)
			int iToFind = sz-n;
			int i = 1;
			Node prev = head;
			while(i<iToFind) {
				prev=prev.next;
				i++;
			}
			prev.next=prev.next.next;
			return;
		}
		
		//find mid using slow fast rule
		public Node findMid(Node head) {
			Node slow = head;
			Node fast = head;
			while(fast != null && fast.next != null) {
				slow = slow.next; //+1
				fast = fast.next.next; //+2
			}
			
			return slow; //slow is my midNode
		}
		
		public boolean checkPalindrome() {
			//base case
			if(head == null || head.next == null) {
				return true;
			}
			// step1 - find mid
			Node midNode = findMid(head);
			
			// step2 - reverse 2nd half
			Node prev=null;
			Node curr=midNode;
			Node next;
			while(curr != null) {
				next = curr.next;
				curr.next = prev;
				prev = curr;
				curr = next;
			}
			Node right = prev; //right half head
			Node left = head;
			
			//step3 - check left half & right half
			while(right != null) {
				if(left.data != right.data) {
					return false;
				}
				left = left.next;
				right = right.next;
			}
			return true;
		}
	
	public static void main(String args[]) {
		LinkedList ll = new LinkedList();
		ll.addFirst(2);
		ll.addFirst(1);
		ll.addLast(3);
		ll.addLast(4);
		ll.add(2, 9);
//		ll.print();
//		System.out.println("Size of linked list -> "+ ll.size);	
//		System.out.println("remove first node data is -> "+ll.removeFirst());
//		System.out.println("remove last node data is -> "+ll.removeLast());
//		ll.print();
//		System.out.println("key 9 is At -> "+ ll.itrSearch(9));
//		System.out.println("key 9 is At -> "+ ll.recSearch(9)+" -> using recursion");
//		ll.reverse();
//		System.out.print("reverse linked list is -> ");
//		ll.print();
//		ll.deleteNthfromEnd(1);
		ll.print();
		System.out.println(ll.checkPalindrome());
		}
}
