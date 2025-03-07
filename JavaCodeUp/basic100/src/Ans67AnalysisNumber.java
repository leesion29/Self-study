import java.util.Scanner;

public class Ans67AnalysisNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if (number<0) {
			System.out.println("minus");
		} else {
			System.out.println("plus");
		}
		
		if (number%2==0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}

	}

}
