import java.util.Scanner;

public class Ans23Input {
	// 실수 1개를 입력 받아, 실수와 정수 부분을 분리하여 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String f = sc.next();
		String[] splitStr = f.split("\\.");
		System.out.printf("%s\n%s", splitStr[0], splitStr[1]);
	}
}
