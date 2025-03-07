package quiz;

public class ArrTest02 {
	// 주어진 배열 numbers에서 최댓값과 최솟 값을 찾는 코드를 작성하라
	public static void main(String[] args) {
		int[] numbers = {23, 45, 12, 67, 34, 89, 2, 99, 56};
		
		int max = numbers[0];
		int min = numbers[0];
		for(int i = 0; i<numbers.length; i++) {
			if (max<numbers[i]) {
				max = numbers[i];
			}
			if (min>numbers[i]) {
				min = numbers[i];
			}
		}
		System.out.printf("최대 : %d, 최소 : %d", max, min);
	}
	
	
}
