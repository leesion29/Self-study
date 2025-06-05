import java.util.Scanner;

public class Ans61Bit3 {

	public static void main(String[] args) {
		// 비트 연산자를 이용해 입력한 수를 OR 연산하라
		// 둘 중 하나라도 1인 자리를 1로 만들어 준다
		// 0001 | 1110 = 1111

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.printf("%d", n|m);
	}

}
