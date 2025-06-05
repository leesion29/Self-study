import java.util.Scanner;

public class Ans25Input {
	// 다섯개의 정수를 입력받아 각 자리 별로 나누어 출력한다
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		System.out.println("[" + a%100000/10000*10000 + "]");
		System.out.println("[" + a%10000/1000*1000 + "]");
		System.out.println("[" + a%1000/100*100 + "]");
		System.out.println("[" + a%100/10*10 + "]");
		System.out.println("[" + a%10 + "]");
	}
}
