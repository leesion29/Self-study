import java.util.Scanner;

public class Ans93Present1 {
	public static void main(String[] args) {
		// 이상한 출석1
		// 학생의 번호를 무작위로 부른다
		// 얼굴과 이름이 기억나지 않는 학생은
		// 여러 번 부른다.
		// 번호를 무작위로 부를 때, 각 번호가 불린 횟수를 출력하자.
		
		Scanner sc = new Scanner(System.in);

		
		int n = sc.nextInt(); // 출석을 부른 횟수
		int[] a = new int[24]; // 데이터 저장할 배열 선언
		for(int i=1; i<=n; i++) { // 개수 만큼 입력 받기
			int t = sc.nextInt();
			a[t] = a[t]+1; // 들어있던 값에 1만큼 더해 다시 저장
		}
		
//		for(int i : a) { // 배열에 저장된 값 출력
//			System.out.print(a[i] + " ");
//		}
	       for (int i = 1; i <= 23; i++) { // 1번부터 23번까지 출력
	            System.out.print(a[i] + " ");
	        }
	}
}
