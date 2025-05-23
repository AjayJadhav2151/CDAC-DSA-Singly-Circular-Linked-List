package CircularLinkedList;
import java.util.Scanner;

public class SinglyCircularLinkedList {
		private Node head;
		
		public SinglyCircularLinkedList() {
			head=null;
		}

		public Node getHead() {
			return head;
		}

		public void setHead(Node head) {
			this.head = head;
		}
		
		Scanner sc = new Scanner(System.in);

		public Node createNode() {
			Node newnode = new Node();
			System.out.println("Enter data value: ");
			newnode.setData(sc.nextInt());
			newnode.setNext(newnode);
			return newnode;
		}
		
		public void addATstart() {
			Node newnode = createNode();
			if(head==null) {
				head=newnode;
			}
			else {
				Node temp=head;
				newnode.setNext(head);
				while(temp.getNext()!=head) {
					temp = temp.getNext();
				}
				temp.setNext(newnode);
				head=newnode;
			}
		}
		
		public void deleteATstart() {
			Node temp=head;
			if(head==null) {
				System.out.println("Linked list.......");
			} else {
				head=head.getNext();
				while(temp.getNext().getNext()!=head) {
					temp = temp.getNext();
				}
				temp.getNext().setNext(null);
				temp.setNext(head);
				System.out.println("Node Deleted...............");
			}
		}
		
		public void addATend() {
			Node newnode = createNode();
			if(head==null) {
				head=newnode;
			}
			else {
				Node temp=head;
				newnode.setNext(head);
				while(temp.getNext()!=head) {
					temp = temp.getNext();
				}
				temp.setNext(newnode);
			}
		}
		
		public void deleteATend() {
			Node temp=head;
			if(head==null) {
				System.out.println("Linked list.......");
			} else {
				while(temp.getNext().getNext()!=head) {
					temp = temp.getNext();
				}
				temp.getNext().setNext(null);
				temp.setNext(head);
				System.out.println("Node Deleted...............");
			}
		}
		
		public void AddMid(int value) {
			Node newnode = createNode();
			Node temp=null;
			if(head==null) {
				head=newnode;
			}
			else if(head.getNext() == null) {
				if(head.getData()==value) {
					head.setNext(newnode);
				} 
				else 
				{
					System.out.println("\tError::Node not exists....!!!!");
				}
			} 
			else {
				temp=head;
				while(temp.getNext()!=head && temp.getData()!=value) {
					temp=temp.getNext();
				}
//				if(temp!=null) {
					newnode.setNext(temp.getNext());
					temp.setNext(newnode);
//				}
			}
		}
		
		public void deletefrommid(int value) {
			Node temp = head;
			Node tag = null;
			if(head==null) {
				System.out.println("\n\nLinkedList is Empty.....");
			} else if(head.getNext() == null) {
				if(head.getData()==value) {
					head.setNext(null);
					System.out.println("node is deleted");
				} 
				else 
				{
					System.out.println("\tError::Node not exists....!!!!");
				}
			}
			else 
			{ 
				while(temp.getNext()!=head && temp.getData() != value) {
					tag = temp;
					temp = temp.getNext();
				}
//				if(temp!=null) {
					tag.setNext(temp.getNext());
					temp.setNext(null);
//				}
				System.out.println("node is deleted");
			}
		}
		
		public void AddPosition(int pos) {
			Node newnode = createNode();

			if (pos == 1) 
			{
				if (head == null) {
					head = newnode;
				} else {
					Node temp=head;
					newnode.setNext(head);
					while(temp.getNext()!=head) {
						temp = temp.getNext();
					}
					temp.setNext(newnode);
					head=newnode;
				}
				System.out.println("Node Added.....");
			} 
			else if (pos == (getCount() + 1)) 
			{

				Node temp=head;
				newnode.setNext(head);
				while(temp.getNext()!=head) {
					temp = temp.getNext();
				}
				temp.setNext(newnode);
				System.out.println("Node Added.....");
			} 
			else if (pos > 1 && pos < (getCount() + 1)) 
			{
				Node temp = head;
				for (int i = 1; i < pos - 1; i++) {
					temp = temp.getNext();
				}
				if(temp!=null) {
					newnode.setNext(temp.getNext());
					temp.setNext(newnode);
				}
				System.out.println("Node Added.....");
			} 
			else 
			{
				System.out.println("Position Not exits........");
			}
		}
		
		public int getCount() {
			int count=0;
			if(head==null) {
				return count;
			}
			else 
			{
				Node temp=head;
				while(true) {
					count++;
					if(temp.getNext()==head) {
						break;
					}
					temp = temp.getNext();
				}
			}
			System.out.println("Count is: "+count);
			return count;
		}
		
		public void display() {
			Node temp=head;
			if(head==null) {
				System.out.println("Linked List is Empty..........");
			}
			while(temp.getNext()!=head) {
				System.out.print(temp.getData()+" -> ");
				temp = temp.getNext();
			}
			System.out.println(temp.getData());
		}
}
