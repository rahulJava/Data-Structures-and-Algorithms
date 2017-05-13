package DoubleLikedList;

class DoublyLinkedList
{
	Node first;
	Node Last;
	

	public DoublyLinkedList()
	{
		this.first=null;
		this.Last=null;
	}
	public void insertatFirst(int data)
	{
		Node N1 = new Node();
		N1.data=data;
		if(isEmpty())
		{
			Last=N1;
		}
		else
		{
			first.previous=N1;
		}
		N1.next=first;
		first=N1;
		
	}
	public void insertAtLast(int data)
	{
		Node N2 = new Node();
		N2.data=data;
		if(isEmpty())
		{
			first=N2;
		}
		else
		{
			Last.next=N2;
			N2.previous=Last;
		}
		Last=N2;
	}
	public boolean isEmpty()
	{
		return first==null;
	}
	public void display()
	{
		Node currentNode = first;
		while(currentNode!=null)
		{
			currentNode.displayNode();
			currentNode=currentNode.next;
		}
		System.out.println();
	}
	public void displayFromLast()
	{
		Node currentNode=Last;
		while(currentNode!=null)
		{
			currentNode.displayNode();
			currentNode=currentNode.previous;
		}
	}
	public Node deleteAtFirst()
	{
		Node currentNode = first;
		if(first==null)
		{
			System.out.println("Hi Inside deleteAtFirst");
			Last=null;
		}
		else{
			first.next.previous=null;
		}
		
		first=first.next;
		return first;
	}
	
	public Node deleteAtLast()
	{
		Node currentNode = Last;
		if(Last==null)
		{
			first=null;
		}
		else
		{
			Last.previous.next=null;
		}
		
		Last=Last.previous;
		System.out.println();
		return currentNode;
		
	}
	
}