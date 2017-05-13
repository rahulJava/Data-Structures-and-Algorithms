import java.util.HashMap;
import java.util.Scanner;


public class FirstNonRepeated 
{
	public static void main(String[] args) {
		System.out.println("Enter the String:");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		char c = firstNonrepeatedCharacter(str);
		System.out.println("c:"+c);
	}
	public static Character firstNonrepeatedCharacter(String str)
	{
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		int length = str.length();
		char[] charArray = str.toCharArray();
		Character c;
		for(Character char1:charArray)
		{
			if(map.containsKey(char1))
			{
				map.put(char1, map.get(char1)+1);
			}
			else
			{
				map.put(char1, 1);
			}
		}
		for(Character char2 : charArray)
		{
			if(map.get(char2)==1)
			{
			return char2;	
			}
		}
	return null;
	}
	

}
