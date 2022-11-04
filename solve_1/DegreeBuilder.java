
public class DegreeBuilder {
	
	public static long pow(long num, int degree) {
				
		if (degree > 1)
			return num * pow(num, --degree);
		else if (degree == 0)
			return 1;
		
		return num;
		
	}
	
}
 
