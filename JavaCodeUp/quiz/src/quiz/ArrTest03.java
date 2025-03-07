package quiz;

public class ArrTest03 {
	public static void main(String[] args) {
		//3x3 크기의 배열을 선언하고, 1 ~ 9 까지의 숫자를 차례대로 채워 넣은 뒤, 출력하는 코드를 작성하라
		int[][] arr = { {1, 2, 3},
				{4, 5, 6},
				{7, 8, 9} };
		for(int i = 0; i<arr.length;i++) {
			for(int j = 0; j<arr[i].length;j++) {
				System.out.print(arr[i][j] + ", ");
			}
		}
	}
}

