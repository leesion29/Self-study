import java.util.Scanner;

public class Ans81RollingTwoDice {

	public static void main(String[] args) {
		// 1 ~ n 까지, 1~ m까지 적힌 주사위 2 개를 던졌을 때 나올 수 있는 모든 경우의 수를 출력하라
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j<= m; j++) {
				System.out.printf("%d %d", i, j);
				System.out.println();
			}
		}

	}

}
