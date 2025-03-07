import java.util.Scanner;

public class Ans58Logical6 {

	public static void main(String[] args) {
		// 둘 다 거짓인 경우에만 참을 출력하라
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		boolean x = a==1 ? true : false;
		boolean y = b==1 ? true : false;
		
		// 둘 다 참이거나 혹은 둘다 거짓이거나
		boolean isNotSame = !x&&!y;
		if(isNotSame) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
	}

}
