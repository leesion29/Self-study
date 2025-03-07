import java.util.Scanner;

public class Ans70Season {

	public static void main(String[] args) {
		// 월을 입력받으면, 계절을 출력하시오.
		Scanner sc = new Scanner(System.in);
		int season = sc.nextInt();

		switch (season) {
		case 12, 1, 2: {
			System.out.println("winter");
			break;
		} case 3, 4, 5: {
			System.out.println("spring");
			break;
		} case 6, 7, 8 : {
			System.out.println("summer");
			break;
		} default : {
			System.out.println("fall");
			break;
		}

		}

	}
}
