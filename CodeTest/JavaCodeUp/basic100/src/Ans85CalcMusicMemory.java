import java.util.Scanner;

public class Ans85CalcMusicMemory {

	public static void main(String[] args) {
		// 필요한 저장 공간을 MB 단위로 바꾸어 출력한다.
		// 단, 소수점 둘째 자리에서 반올림해 첫째 자리까지 출력하고 MB를 공백을 두고 출력한다.

		Scanner sc = new Scanner(System.in);
		float h = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		float s = sc.nextFloat();
		
		System.out.printf("%.1f MB", h*b*c*s /(8*1024*1024));
	}
}