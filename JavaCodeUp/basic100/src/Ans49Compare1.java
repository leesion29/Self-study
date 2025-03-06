import java.util.Scanner;

public class Ans49Compare1 {

	public static void main(String[] args) {
		// 정수 a, b를 입력받아
		// a>b이면, 1을, 
		// a<=b이면, 0을 출력한다
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// 삼항 연산자
		int result = a > b ? 1 : 0;
		System.out.println(result);
	}

}
