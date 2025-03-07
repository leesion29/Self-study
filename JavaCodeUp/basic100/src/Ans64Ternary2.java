import java.util.Scanner;

public class Ans64Ternary2 {

	public static void main(String[] args) {
		// 삼항 연산자를 이용해서 값을 구하시오.
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		//a, b, c 중 가장 작은 숫자를 출력하면 된다.
		// 예시 -> 1, 2, 3이 각각 a, b, c라고 가정한다.
		// a<b?a:b : 1과 2를 비교한다. 1<2가 참이므로 a(1)이 결과가 된다.
		// a<c -> 1<3이 참이므로 (a<b?a:b)가 결과다.
		// 따라서 가장 작은 수가 1이다.
		System.out.println((a<b?a:b)<c ? (a<b?a:b):c);
	}

}
