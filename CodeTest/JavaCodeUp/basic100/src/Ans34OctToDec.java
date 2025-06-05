import java.util.Scanner;

public class Ans34OctToDec {

	public static void main(String[] args) {
		// OctToDec
		Scanner sc = new Scanner(System.in);
		String oct = sc.next();
		// 8진수를 10진수로 바꾸는 법
		int dec = Integer.parseInt(oct, 8);
		System.out.print(dec);
	}

}
