import java.util.Scanner;

public class Ans48Calc6 {

	public static void main(String[] args) {
		// 정수 입력받아 계산하기
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// 2^b배의 값이 출력된다
		System.out.println(a<<b);
	}

}
