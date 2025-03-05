import java.util.Scanner;

public class Ans24Input {
	// 단어 1개를 입력 받아, 분리하여 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] word = new String[20];
		word[0] = sc.nextLine();
		
		for (int i = 0; i<word[0].length(); i++) {
			System.out.println("\'" + word[0].charAt(i) + "\'");
		}
	}
}
