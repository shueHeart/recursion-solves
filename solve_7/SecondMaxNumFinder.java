import java.util.List;

public class SecondMaxNumFounder {
	
	
	public static int find(List<Integer> list) {
		return find(list, 0, 0, 0);
	}
	
	private static int find(List<Integer> list, int index, int maxNum, int secondMaxNum) {
		
		if (index >= list.size()) return secondMaxNum;
		
		if (maxNum <= list.get(index)) {
			secondMaxNum = maxNum;
			maxNum = list.get(index);
		} 
		else if (secondMaxNum < list.get(index)) {
			secondMaxNum = list.get(index);
		}
		
		return find(list, index + 1, maxNum, secondMaxNum);
	}
}
