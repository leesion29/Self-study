import java.util.Scanner;

public class Ans76CharPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char c = sc.next().charAt(0);
		char a = 'a';
		while((int)c >= 97) {
			System.out.print(a++ + " ");
			c--;
		}
	}
}
