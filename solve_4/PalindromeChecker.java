
public class PalindromeChecker {
	
	public static boolean check(String maybePalindrome) {
		
		if (maybePalindrome.length() <= 1) {
			return true;
		}
		
		if (maybePalindrome.charAt(0) != maybePalindrome.charAt(maybePalindrome.length() - 1)) {
			return false;
		}
				
		return check(maybePalindrome.substring(1, maybePalindrome.length() - 1));
		
	}
	
}




