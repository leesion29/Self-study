import java.util.Scanner;

public class Ans20Input {
	// 주민번호 입력 받아 형태를 바꿔 출력하라
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String juminNum = sc.next();
		String[] splitJumin = juminNum.split("-");
		
		System.out.printf("%s%s", splitJumin[0], splitJumin[1]);
	}
}
