import java.util.Scanner;

public class Ans60Bit2 {

	public static void main(String[] args) {
		// 비트 연산자를 이용해 입력한 수를 AND 연산하라
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.printf("%d", n&m);
	}

}
