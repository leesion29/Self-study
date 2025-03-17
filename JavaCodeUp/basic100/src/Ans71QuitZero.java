import java.util.Scanner;

public class Ans71QuitZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			int n = sc.nextInt();
			if (n!=0) {
				System.out.println(n);
			} else {
				break;
			}
		}
	}

}
