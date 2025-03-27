import java.util.Scanner;

public class Ans82HexGugu {

	public static void main(String[] args) {
		// 입력한 16진수 값을 받아 구구단을 출력해보자.
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int hex = Integer.parseInt(n, 16);
		int maxHex = Integer.parseInt("F", 16);
		for(int i = hex; i == hex; i++) {
			for(int j = 1; j<= maxHex; j++) {
				System.out.printf("%X*%X=%X", i, j, i*j);
				System.out.println();
			}
		}

	}

}
