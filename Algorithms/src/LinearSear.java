
public class LinearSear 
{
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		
		int i =linearSearch(a, 6);
		System.out.println("value of i:"+i);
		
	}
	
	public static int linearSearch(int[] a , int x)
	{
		int answer =1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==x)
			{
			return i;
			}
		}
		
		return answer;
		
	}

}
