import java.util.Scanner;

public class Ans87CalcSmallNum {

	public static void main(String[] args) {
		// 1, 2, 3 ... 을 순서대로 계속 더해나갈 때,
		// 그 합이 입력한 정수보다 작을 동안만 계속 더하는 프로그램을 작성

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1; sum<num; i++) {
			sum = i + sum;
		}
		System.out.println(sum);
	}
}