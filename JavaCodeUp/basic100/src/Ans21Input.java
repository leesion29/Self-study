import java.util.Scanner;

public class Ans21Input {
	// 1개의 단어를 입력 받아 그대로 출력하자
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.next();
		for (int i = 0; i < in.length(); i++) {
			char ch = in.charAt(i);
			System.out.print(ch);
		}
		
	}
}
