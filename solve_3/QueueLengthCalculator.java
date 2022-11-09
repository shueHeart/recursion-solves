package recursion;

import java.util.Queue;

public class QueueLengthCalculator {
	
	public static int lengthCalculate(Queue<Integer> queue) {
				
		if (queue.poll() == null) return 0;
		
		return 1 + lengthCalculate(queue);
		
	}
	
}
