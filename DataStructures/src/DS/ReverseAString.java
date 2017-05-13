package DS;

public class ReverseAString {
	
	int top;
	int maxSize;
	char stackArray[];
	
	public ReverseAString(int x)
	{
		this.maxSize=x;
		stackArray= new char[maxSize];
		top=-1;
	}

	public void push(char y)
	{
		
		top++;
		stackArray[top]=y;
		
	}
	
	public char pop()
	{
		int old_top=top;
		top--;
		return stackArray[old_top];
		
		
	}
	
	public boolean isEmpty()
	{
		return (top==-1);
	}
	public boolean isFull()
	{
		return(maxSize-1==top);
	}

}
