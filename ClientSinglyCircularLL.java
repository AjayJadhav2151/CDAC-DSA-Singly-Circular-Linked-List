package CircularLinkedList;

import java.util.Scanner;

public class ClientSinglyCircularLL {

	public static void main(String[] args) {
		SinglyCircularLinkedList scl = new SinglyCircularLinkedList();
		
		Scanner sc = new Scanner(System.in);
		
int option = 0,value,position=0;
		
		do {
			System.out.println(">>>>>>>>>>>>>>>>MENU<<<<<<<<<<<<<<<<<<<");
			System.out.println("\n 1.Create Node"+
					"\n 2.Add first"+
					"\n 3.Add Last"+
					"\n 4.Add Mid"+
					"\n 5.Count Linked List"+
					"\n 6.Delete From Start"+
					"\n 7.Delete From Last"+
					"\n 8.Delete From MID"+
					"\n 9.Add AT Position"+
					"\n 11.display"+
					"\n 0.exit");
			System.out.println("Enter your choice:: ");
			option=sc.nextInt();
			
			switch(option) {
			case 1:
				Node newnode = scl.createNode();
				scl.setHead(newnode);
				System.out.println("\n Linked List created...............");
				break;
			case 2: 
				scl.addATstart();
				break;
			case 3:
				scl.addATend();
				break;
			case 4: 
				System.out.println("Enter Element ::");
				value = sc.nextInt();
				scl.AddMid(value);
				break;
			case 5:
				scl.getCount();
				break;
			case 6: 
				scl.deleteATstart();
				break;
			case 7: 
				scl.deleteATend();
				break;
			case 8: 
				System.out.println("Enter Element ::");
				value = sc.nextInt();
				scl.deletefrommid(value);
				break;
			case 9:
				System.out.println("Enter the position: ");
				position = sc.nextInt();
				scl.AddPosition(position);
				break;
			case 11:
				System.out.println("...................................");
				scl.display();
				System.out.println("...................................");
				break;
			case 0:
				System.out.println("End.....................");
				System.exit(0);
			
			}
		}while(option != 0);
	}

}
