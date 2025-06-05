import java.util.Scanner;

public class Ans59Bit {

	public static void main(String[] args) {
		// 비트 연산자를 통해 입력한 수를 NOT 연산하라
		// 비트 단위로 1 -> 0, 0 -> 1로 바꾼 후 그 값을 10진수로 출력
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// ~n = -n - 1
		// -n = ~n + 1
		
		//따라서 같은 결과 값이 나온다.
		//System.out.println(-n - 1);
		System.out.printf("%d", ~n);
	}

}
