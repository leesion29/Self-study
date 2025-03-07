import java.util.Scanner;

public class Ans63Ternary {

	public static void main(String[] args) {
		// 삼항 연산자를 이용해서 값을 구하시오.
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println((a>b)?a:b);
	}

}
