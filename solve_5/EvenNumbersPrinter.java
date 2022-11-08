package recursion;

import java.util.List;

public class EvenNumbersPrinter {
	
	
	public static void print(List<Integer> list) {
		print(list, 0);
	}
	
	private static void print(List<Integer> list, Integer index) {
		
		if (index >= list.size()) return;
		
		Integer number = list.get(index);
		
		if (number % 2 == 0) System.out.println(number); 
		
		print(list, index + 1);
		
	}
	
}	
