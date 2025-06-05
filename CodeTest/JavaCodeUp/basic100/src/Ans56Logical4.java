import java.util.Scanner;

public class Ans56Logical4 {

	public static void main(String[] args) {
		// 참/거짓이 다른 경우에만 참을 출력하라(XOR)
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		boolean x = a==1 ? true : false;
		boolean y = b==1 ? true : false;
		
		// x, y가 참/거짓인 경우 혹은 거짓/참인 경우 참이 되도록 하면 된다
		if((x&&!y)||(!x&&y)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
	}

}
