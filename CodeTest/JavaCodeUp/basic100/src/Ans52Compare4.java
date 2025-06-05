import java.util.Scanner;

public class Ans52Compare4 {

	public static void main(String[] args) {
		//a, b를 비교하라
		//a!=b면 1을, 아니라면 0을 출력한다
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a!=b ? 1:0);
	}
}