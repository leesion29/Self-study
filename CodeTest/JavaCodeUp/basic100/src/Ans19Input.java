import java.util.Scanner;

public class Ans19Input {
	// 연.월.일을 입력 받아 세 변수에 저장하고 입력한 방식 그대로 출력하라
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String calendar = sc.next();
		String[] calArr = calendar.split("\\."); // .을 사용하려면 이스케이프 문자를 활용해야 한다
		int year = Integer.parseInt(calArr[0]);
		int month = Integer.parseInt(calArr[1]);
		int day = Integer.parseInt(calArr[2]);
		System.out.printf("%04d.%02d.%02d", year, month, day);
	}
}
