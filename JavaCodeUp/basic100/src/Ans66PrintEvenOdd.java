import java.util.Scanner;

public class Ans66PrintEvenOdd {

	public static void main(String[] args) {
		// 정수를 3개 입력받아 짝수/홀수 출력하기
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		EvenOrOdd(a);
		EvenOrOdd(b);
		EvenOrOdd(c);
	}
	
	static void EvenOrOdd(int n) {
		Boolean isEven = n%2==0 ? true : false;
		if(isEven) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}
}
