import java.util.Scanner;

public class Ans35HexToOct {

	public static void main(String[] args) {
		// HexToOct
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		
		int hex = Integer.parseInt(n, 16);
		String oct = Integer.toOctalString(hex);
		System.out.print(oct);
	}

}
