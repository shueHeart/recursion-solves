package recursion;

import java.util.Queue;

public class QueueLengthCalculator {
	
	public static int lengthCalculate(Queue<Integer> queue) {
		int length = 0;
		
		if (queue.poll() == null) return 0;
		
		++length;
		
		return length += lengthCalculate(queue);
	}
	
}
