package LinkedList;

public class App {
	public static void main(String[] args) {
		Node nodeA  =new Node();
		nodeA.data=4;
		
		
		Node nodeB = new Node();
		nodeB.data=5;
		
		Node nodeC = new Node();
		nodeC.data=6;
		
		Node nodeD = new Node();
		nodeD.data=7;
		
		nodeA.next=nodeB;
		nodeB.next=nodeC;
		nodeC.next=nodeD;
		System.out.println(listLength(nodeB));
		
		
	}

	public static int listLength(Node aNode)
	{
	    int i=0;
		while(aNode!=null)
		{
			i++;
			aNode=aNode.next;
			 
		}
		return i;
	}
}
