package linkedlist;

class node{
	 
	int data;
	node next;
	node(int N) {
		data=N;
	next=null;
	}
	
}
public class KthElement {

	private static linkedlist.node N(node head,int N) {
			node temp=new node(N);
			if(head==null)
			{
				return temp;
			}
			node curr=head;
			while(curr.next!=null)
				curr=curr.next;
			curr.next=temp;
			return head;
		}
	 
	private static void Node(node head) {
		if(head!=null)
		{
			System.out.print(head.data+" ");
			Node(head.next);
		}		
	}
     public static void main(String[] args) {
		node LinkedList=null;
		LinkedList=N(LinkedList,5);
		LinkedList=N(LinkedList,8);
		LinkedList=N(LinkedList,4);
		LinkedList=N(LinkedList,6);
		LinkedList=N(LinkedList,12);
		LinkedList=N(LinkedList,9);
		LinkedList=N(LinkedList,7);
		LinkedList=N(LinkedList,2);
		
		Node(LinkedList);
		System.out.println();
		
		node slow=LinkedList;
		node fast=LinkedList.next.next.next;
		while(slow!=null)
		{
			slow=slow.next;
			fast=fast.next;
			if(fast==null) {
				System.out.println(slow.data);
				break;
			}	
		}
	}
}
