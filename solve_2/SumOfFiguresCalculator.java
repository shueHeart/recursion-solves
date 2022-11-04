package recursion;

public class SumOfFiguresCalculator {
	
	public static int calculate(int number) {

		int sum = 0;
		
		if (number != 0){
			sum += number % 10 + calculate(number / 10);
		}
		
		return sum;
		
	}
	
}
