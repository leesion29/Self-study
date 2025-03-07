import java.util.Scanner;

public class Ans55Logical3 {

	public static void main(String[] args) {
		//참 또는 거짓이 입력되면
		//하나라도 참인 경우, 참을 출력하라
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean trueOrFalseN = n==1 ? true : false;
		boolean trueOrFalseM = m==1 ? true : false;

		// ||는 하나라도 참인 경우에만 참을 반환한다
		boolean isHaveTrue = trueOrFalseN || trueOrFalseM;
		if (isHaveTrue) {
			System.out.print(1);
		} else {
			System.out.println(0);
		}
	}
}