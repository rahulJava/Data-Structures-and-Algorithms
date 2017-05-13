
public class recursiveString {
	public static void main(String[] args) {
		String name ="rahul";
		String reverseStr = reverseRecursively(name);
		System.out.println(reverseStr);
		
	}
	public static String reverseRecursively(String str) {

        //base case to handle one char string and empty string
        if (str.length() < 2) {
            return str;
        }

        System.out.println("string:"+str.substring(1));
        System.out.println("charat:"+str.charAt(0));
        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }




}
