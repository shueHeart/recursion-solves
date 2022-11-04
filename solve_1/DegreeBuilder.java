package recursion;

public class DegreeBuilder {
	
	public static long pow(long num, int degree) {
		
		long res = num;
		
		if (degree > 1)
			res = num * pow(res, --degree);
		else if (degree == 0)
			return 1;
		
		return res;
		
	}
	
}
 