
public class RecursionBinary {
	public static void main(String[] args) {
		{
			
			int a[]={10,60,40,50,30,90} ;
			int x=90;
			//System.out.println(recursive(a,x,0));
			System.out.println(binarySearch(0,a.length-1,a,x));
			
		}
		
	} 

	static int recursive(int[] a , int x, int y)
	{
		if(y>a.length-1)
		{
			return -1;
		}
		else if(a[y]==x)
		{
			return y;
		}
		else
			System.out.println("y:"+y);
			return recursive(a, x, y+1);
	}
	static int binarySearch(int p,int r, int[]a,int x)
	{
		if(p>r)
		{
			return -1;
		}
		else 
		{
			int q = p+r/2;
			if(a[q]==x)
			{
				return q;
			}
			else if(a[q]>x)
			{
				r=q-1;
				return binarySearch(p, r, a, x);
				
			}
			else 
			{
				p=q+1;
				return binarySearch(p, r, a, x);
			}
		}
	}
}
