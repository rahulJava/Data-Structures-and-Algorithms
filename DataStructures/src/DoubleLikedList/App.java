package DoubleLikedList;

public class App 
{

	public static void main(String[] args) {
		DoublyLinkedList d1 = new DoublyLinkedList();
		d1.insertatFirst(10);
		d1.insertatFirst(20);
		d1.insertAtLast(30);
		
		d1.display();
		//d1.displayFromLast();
		d1.displayFromLast();
		d1.deleteAtLast();
		d1.deleteAtLast();
		//d1.deleteAtLast();
		d1.displayFromLast();
		
	}
}
