//package co.linkedlist;
//
//public class LinkedListExample {
//	Node head;
//	static class Node {
//		int data;
//		Node next;
//		Node (int d){
//		data = d;
//		next=null;}
//	}
//	public void display() {
//		Node n=head;
//		while (n!=null) {
//			System.out.println(n.data+"\n");
//	
//			n=n.next;
//		}
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//LinkedListExample list=new LinkedListExample();
//list.head= new Node(100);
//Node second=new Node(200);
//Node third=new Node(300);
//list.head.next=second;
//second.next=third;
//list.display();
//	}
//
//}

package co.linkedlist;
public class LinkedListExample{
	Node head;
	static class Node{
		int data;
		Node next;
		Node (int d){
			data = d;
			next = null;
			
		}
	}
	public void display() {
		Node n=head;
		while(n!=null) {
			System.out.println(n.data+"\n");
			n=n.next;
		}
	}
	public static void main(String[] args) {
		LinkedListExample list= new LinkedListExample();
		list.head=new Node(100);
		Node second=new Node(200);
		Node third=new Node(300);
		list.head.next=second;
		second.next=third;
		list.display();
	}
}
