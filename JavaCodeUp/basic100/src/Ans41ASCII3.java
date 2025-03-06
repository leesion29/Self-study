import java.util.Scanner;

public class Ans41ASCII3 {

	public static void main(String[] args) {
		// 다음 문자 출력하기
		Scanner sc = new Scanner(System.in);
		char s = sc.next().charAt(0);
		System.out.println((char)(s+1));
	}

}
