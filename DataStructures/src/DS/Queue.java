package DS;

public class Queue
{
	int maxSize;
	long arr[];
	int rear;
	int front;
	int numItem;
	public Queue(int size)
	{
		this.maxSize=size;
		arr = new long[maxSize];
		rear=-1;
		front=0;
		numItem=0;
		
	}
	
	public void insert(int x)
	{
		
		if(rear==maxSize-1)
		{
			System.out.println("queue is full");
			rear=-1;
		}
		rear++;
		arr[rear]=x;
		numItem++;
				
		
		
	}
	
	public long remove()
	{
		if(front==maxSize)
		{
			front =0;
		}
		int old_front = front;
		front++;
		numItem--;
	
		
		return arr[old_front];
	}
	
	public boolean isEmpty()
	{
		return (front==maxSize);
	}
	public boolean isFull()
	{
		return(numItem==maxSize);
	}
	public void view()
	
	{
		
		System.out.print("[");
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.print(arr[i]+" ");
			
		}
		System.out.println("]");
		
	}
	
}
