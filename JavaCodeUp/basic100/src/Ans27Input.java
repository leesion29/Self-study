import java.util.Scanner;
public class Ans27Input {
	// 년.월.일을 입력받아 일-월-년으로 출력하라
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String date = sc.next();
		String[] arr = date.split("\\.");
		int y = Integer.parseInt(arr[0]);
		int m = Integer.parseInt(arr[1]);
		int d = Integer.parseInt(arr[2]);
		
		System.out.printf("%02d-%02d-%04d", d, m, y);
	}
}