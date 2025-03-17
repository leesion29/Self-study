import java.util.Scanner;

public class Ans73QuitZero2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 1;
		while(n!=0) {
			n = sc.nextInt();
			if(n!=0) {
				System.out.println(n);
			}
		}
	}

}
