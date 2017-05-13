package DS;

public class App1 {
	public static void main(String[] args) {
		
		
		reverseString("Hello");
		
		
	}
	public static void reverseString(String value)
	{
		
		int length = value.length();
		ReverseAString rev = new ReverseAString(length);
		for(int i=0;i<value.length();i++)
		{
			char j = value.charAt(i);
			rev.push(j);
			
		}
		String result="";
		while(!rev.isEmpty())
		{
			char k = rev.pop();
			System.out.println(k);
			result=result+k;
			
		}
		System.out.println(result);
	}

}