import java.util.Scanner;

public class Ans90Series2 {
	public static void main(String[] args) {
		// 수열을 만들어보자.

		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong(); // 시작 값
		long r = sc.nextLong(); // 등비
		long n = sc.nextLong(); // 몇 번째 항
		long series = (long) (a* Math.pow(r, n-1)); // 등비수열의 일반 항 공식

		System.out.println(series);
	}
}
