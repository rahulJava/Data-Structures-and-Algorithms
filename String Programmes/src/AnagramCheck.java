import java.util.Arrays;

public class AnagramCheck
{
	public static void main(String[] args)
	{
		boolean is=isAnagram("Nitin", "itinN");
		System.out.println("is:"+is);
	}
	
	public static boolean isAnagram(String word, String anagram){
		if(word.length()!=anagram.length()){
			return false;
		}
		char[] chars=word.toCharArray();
		char[] chars1=anagram.toCharArray();
		Arrays.sort(chars);
		Arrays.sort(chars1);
		System.out.println(chars1);
		String str = new String (chars1);
		System.out.println(str);
		
		
		for(Character c:chars)
		{
			int index = str.indexOf(c);
			if(index!=-1)
			{
				str=str.substring(index+1,str.length());
			}
			else
			{
				return false;
			}
		}
		return true;
		}

};