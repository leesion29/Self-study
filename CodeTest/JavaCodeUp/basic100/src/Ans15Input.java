import java.util.Scanner;

public class Ans15Input {
	// 소수점 셋 째 자리에서 반올림하여 소수점 이하 둘 째 자리까지 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float f = sc.nextFloat();
		
		System.out.printf("%.2f", f);

	}

}
