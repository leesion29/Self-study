package quiz;

public class ArrTest01 {
	// 크기가 5인 정수배열을 선언, 1 ~ 5까지의 값으로 초기화 하라
	// 그 후, 배열의 모든 요소를 for문을 사용해 출력하는 코드를 작성하라.
	public static void main(String[] args) {
		int[] arr;
		arr = new int[5];
		
		for(int i = 0; i<5; i++) {
			arr[i] = i+1;
		}
		
		for(int i : arr) {
			System.out.println(i);
		}
	}
}
