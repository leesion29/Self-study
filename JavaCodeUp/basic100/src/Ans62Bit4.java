import java.util.Scanner;

public class Ans62Bit4 {

	public static void main(String[] args) {
		// 비트 연산자를 이용해 입력한 수를 XOR 연산하라
		// 수학에서 ^는 거듭제곱을 표기할 때 사용하나
		// 자바에서는 Math.pow()를 이용해 거듭제곱 연산을
		// 하고, 비트연산 XOR에 ^를 사용한다
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.printf("%d", n^m);
	}

}
