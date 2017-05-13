package DS;

public class App3 {
	public static void main(String[] args) {
		Queue theQueue = new Queue(5);
		theQueue.insert(5);
		theQueue.insert(4);
		theQueue.insert(3);
		theQueue.insert(2);
		theQueue.insert(1);
		theQueue.insert(8);
		theQueue.insert(7);
		theQueue.insert(8);
		theQueue.insert(7);
		theQueue.insert(8);
		theQueue.insert(7);
		theQueue.insert(8);
		theQueue.insert(7);
		
		theQueue.view();
		
	
		
		
		
		
		while(!theQueue.isEmpty())
		{
			long x = theQueue.remove();
			System.out.println(x);
		}
		
	}

}
