/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    public static String uniqueChars(String s) {
	String ans = "";
	for (int i = 0; i < s.length(); i++) {
		char checkChar = s.charAt(i);
		if (ans.indexOf(checkChar) == -1 || checkChar == 32) {
			ans += checkChar; 
		}	
	}
	return ans;
    }
}





    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */