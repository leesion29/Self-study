import java.util.Scanner;

public class Ans65PrintEven {

	public static void main(String[] args) {
		// 정수를 3개 입력받아 짝수만 출력하기
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		printEven(a);
		printEven(b);
		printEven(c);
	}
	
	static void printEven(int n) {
		Boolean isEven = n%2==0 ? true : false;
		if(isEven) {
			System.out.println(n);
		}
	}

}
