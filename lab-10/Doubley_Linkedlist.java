import java.util.*;
class List{
	 Node head;
	 Node last;
	 class Node{
		 int data;
		 Node next;
		 Node prev;

		Node(int a){
			data = a;
			next = null;
			prev = null;
		}
	}
	void insertAtEnd(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            last = node;
        } else {
            last.next = node;
            node.prev = last;
            last = node;
        }
    }
	public void insertAtFirst(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
            last = node;
        } else {
            node.next = head;
            head = node;
        }

    }
		  
		  void display(){
		  	Node current=head;
			if (head==null) {
				System.out.println("Empty List !!");
				return;
			}
			else
			{
				while(current.next!=null)
				{
					System.out.println("["+current.data+"]");
					current=current.next;
				}
				System.out.println("["+current.data+"]");
					System.out.println();
			}
		}

public int deleteByIndex(int i) {
        Node cNode = head, pNode = null;
        if (head == null) {
            System.out.println("Linked List Is Empty!!!");
            return -1;
        } else {
            int count = 1;
            while (cNode.next != null) {
                pNode = cNode;
                cNode = cNode.next;
                count++;

                if (count == i) {
                    pNode.next = cNode.next;
                }
            }
            return pNode.data;
        }

    }
}
public class Doubley_Linkedlist{
	public static void main(String[] args) {
	List li = new List();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Insert At First \n2. Delete By Index \n3. Insert At Last \n4. Display \n5. Exit");
            int op = sc.nextInt();
            if (op == 1) {
                System.out.println("Enter A element for inserted at first : ");
                int element1 = sc.nextInt();
                li.insertAtFirst(element1);
            } else if (op == 2) {
                System.out.println("Enter Index Of Deleting Element : ");
                int element2 = sc.nextInt();
                li.deleteByIndex(element2);
            } else if (op == 3) {
                System.out.println("Enter A Element For Insert : ");
                int element3= sc.nextInt();
                li.insertAtEnd(element3);
            } else if (op == 4) {
                li.display();
            } else if (op == 5) {
                break;
            }
        }
    }
}