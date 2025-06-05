import java.util.Scanner;

public class Ans50Compare2 {

	public static void main(String[] args) {
		// 정수 a, b를 입력받아
		// a==b라면 1,
		// a!=b라면 0을 출력해보자
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a==b ? 1:0);
	}

}
