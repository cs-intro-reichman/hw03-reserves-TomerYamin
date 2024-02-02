/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

    public static String lowerCase(String s) {
        int length = s.length();
	String lowerCaseStr = "";
	for (int i = 0; i < length; i++) {
		if (s.charAt(i) < 65 || s.charAt(i) > 90) {
			lowerCaseStr+= (char)(s.charAt(i));
		}
	
		else {
			lowerCaseStr+= (char)(s.charAt(i) + 32); 	
		}

	}

	return lowerCaseStr;

    }
}