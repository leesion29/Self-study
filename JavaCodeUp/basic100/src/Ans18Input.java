import java.util.Scanner;

public class Ans18Input {
	// 시간을 입력 받아 두 변수에 저장하고 입력한 방식 그대로 출력하라
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String time = sc.next();
		String[] timeArr = time.split(":");
		System.out.printf("%s:%s", timeArr[0],timeArr[1]);
	}

}
