import java.util.Scanner;

public class Ans79QuitQ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "a";
		while (!str.equals("q")) {
			str = sc.next();
			System.out.println(str);
		}
		
	}

}
