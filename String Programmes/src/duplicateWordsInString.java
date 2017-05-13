import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class duplicateWordsInString 
{
	public static void main(String[] args) {
		System.out.println("Enter the sentence");
		Scanner read = new Scanner(System.in);
		String sentence = read.nextLine();
		String [] str = sentence.split(" ");
		Set duplicate = findDuplicateCharacter(str);
		System.out.println(duplicate);
	}
	
	@SuppressWarnings("null")
	public static Set findDuplicateCharacter(String[] str)
	{
		Set<String> s1 = new HashSet<String>();
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		int length = str.length;
		for(String str1: str)
		{
			
			if(map.containsKey(str1.toLowerCase()))
			{
				map.put(str1.toLowerCase(), map.get(str1.toLowerCase())+1);
			}
			else
			{
				map.put(str1.toLowerCase(), 1);
			}
		}
		System.out.println(map);
		Set<String> wordsInString = map.keySet();
		for(String str2:wordsInString)
		{
			
			if(map.get(str2)>1)
			{
				System.out.println("Inside inf:"+str2);
				
				s1.add(str2);
			}
			
		}
		return s1;
	}

}
