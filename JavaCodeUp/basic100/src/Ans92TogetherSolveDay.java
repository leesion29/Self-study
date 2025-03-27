import java.util.Scanner;

public class Ans92TogetherSolveDay {
	public static void main(String[] args) {
		// 이상한 수열을 만들어보자.
		// 시작 값 a
		// 다음 수 a * m + d
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong(); // 시작 값
		long m = sc.nextLong();  // 곱할 값
		long d = sc.nextLong();  // 더할 값
		long n = sc.nextLong();  // 몆 번째 수인지 나타내는 정수

		Long i = 1L;
		while(i != n) {
			a = a * m + d;
			++i;
		}
		System.out.println(a);
	}
}
