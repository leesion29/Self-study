import java.util.Scanner;

public class Ans83LetsBeKingof369Game {

	public static void main(String[] args) {
		// 3 6 9 게임의 왕이 되기 위해 프로그램을 작성해보자
		// 1 ~ n 까지의 수를 순서대로 공백을 두고 출력하는데,
		// 만약 수가 3, 6, 9 중 하나라면 X를 대신 출력하도록 해야 한다.

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i<= n; i++) {
			if (i == 3 || i == 6 || i == 9) {
				System.out.print("X ");
			} else {
				System.out.print(i + " ");
			}
		}

	}
}