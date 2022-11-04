
public class SumOfFiguresCalculator {
	
	public static int calculate(int number) {

		if (number > 0) {
			return number % 10 + calculate(number / 10);
		}
		
		return 0;
			
	}
	
}
