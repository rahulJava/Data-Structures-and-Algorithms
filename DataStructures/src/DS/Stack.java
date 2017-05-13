package DS;

public class Stack 
{
	long [] stackArray;
	int top ;
	int maxSize;
	
	public Stack(int maxSize)
	{
		this.maxSize=maxSize;
		stackArray= new long[maxSize];
		top=-1;
	}
	
	public void push(int x)
	{
		if(isFull())
		{
			System.out.println("The STACK is full");
		}
		else
		{
		top++;
		stackArray[top]=x;
		System.out.println(stackArray[top]);
		}
		
	}
	
	public long pop()
	{
		if(top==-1)
		{
			System.out.println("The STACK is empty");
			return -1;
		}
		else
		{
			int old_top=top;
			top--;
			//System.out.println(stackArray[old_top]);
			return stackArray[old_top];
		}
		
		
	}
	
	public boolean isEmpty()
	{
		return(top==-1);
	}
	public boolean isFull()
	{
		return (maxSize-1==top);
	}

}
