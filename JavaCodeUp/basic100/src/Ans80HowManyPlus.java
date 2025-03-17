import java.util.Scanner;

public class Ans80HowManyPlus {

	public static void main(String[] args) {
		// 1, 2, 3 ... 을 계속 더해 나갈 때,
		// 그 합이 입력한 정수(0 ~ 1000)보다 같거나 작을 때까지
		// 계속 더하는 프로그램을 작성해보자.
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		int i = 0;
		while(!(sum >= num)) {
			sum += ++i;
		}
		System.out.println(i);
	}

}
