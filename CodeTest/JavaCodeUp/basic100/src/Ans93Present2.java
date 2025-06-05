import java.util.Arrays;
import java.util.Scanner;

public class Ans93Present2 {
	public static void main(String[] args) {
		/* 이상한 출석2
			학생의 번호를 무작위로 부른다
			얼굴과 이름이 기억나지 않는 학생은
			여러 번 부른다.
			번호를 무작위로 부를 때, 그 번호를 거꾸로 출력해보자 
		 */

		// 스캐너
		Scanner sc = new Scanner(System.in);

		// 호명 횟수
		int cnt = sc.nextInt();

		// 출석번호
		int[] nums = new int[cnt];

		for(int i = 0; i<cnt; i++) {
			nums[i] = sc.nextInt(); 
		}

		// 역순으로 시작하여 인덱스가 0이 될 때까지 출력
		for(int i = cnt-1; i>=0; i--) {
			System.out.print(nums[i]);
		    if (i != 0) {
		        System.out.print(" ");
		    }
		} 
	}
}
