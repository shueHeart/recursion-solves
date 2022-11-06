
public class PalindromeChecker {
	
	public static boolean check(String string) {
		
		if (string.length() <= 1) {
			return true;
		}
		
		if (string.charAt(0) != string.charAt(string.length() - 1)) {
			return false;
		}
		
		string = string.substring(1, string.length() - 1);
		
		return check(string);
		
	}
	
}




