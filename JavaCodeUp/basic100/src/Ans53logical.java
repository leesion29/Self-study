import java.util.Scanner;

public class Ans53Logical {

	public static void main(String[] args) {
		//참 또는 거짓이 입력되면
		//반대로 출력되게 하라
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		boolean trueOrFalse = n==1 ? true : false;
		
		// NOT 연산을 위해서는 논리연산자 !를 활용하면 된다
		System.out.println(!trueOrFalse==true ? 1:0);
	}
}