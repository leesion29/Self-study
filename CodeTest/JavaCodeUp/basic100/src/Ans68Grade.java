import java.util.Scanner;

public class Ans68Grade {

	public static void main(String[] args) {
		/*
		     점수(정수, 0 ~ 100)를 입력받아 평가를 출력해보자
			 평가 기준
			 점수 범위 : 평가
			 90 ~ 100 : A
			 70 ~   89 : B
			 40 ~   69 : C
			 0 ~   39 : D
			 로 평가되어야 한다.
		 */
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		String grade = (score>=90&&score<=100) ? "A" : (score>=70&&score<=89) ? "B"
				: (score>=40&&score<=69) ? "C" : "D";
		System.out.println(grade);
	}

}
