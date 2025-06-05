import java.util.Scanner;

public class Ans88PassThree {

	public static void main(String[] args) {
		// 1 ~ n 까지 1씩 증가시켜 출력한다.
		// 단, 3의 배수인 경우 출력하지 않는다.

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for(int i = 1; i<=n;i++) {
			if (!(i%3==0)) {
				System.out.print(i + " ");
			}
		}

	}
}