import java.util.Scanner;

public class Ans46Calc4 {

	public static void main(String[] args) {
		// 정수 3개 입력받아 합과 평균 출력하기
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long sum = a+b+c;
		float avg = ((float)a+(float)b+(float)c)/3;
		System.out.println(sum);
		System.out.printf("%.1f", avg);
	}

}
