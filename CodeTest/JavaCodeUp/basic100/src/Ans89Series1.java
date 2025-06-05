import java.util.Scanner;

public class Ans89Series1 {
    public static void main(String[] args) {
    	// 수열을 만들어보자.
    	
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // 시작 값
        int d = sc.nextInt(); // 공차
        int n = sc.nextInt(); // 몇 번째 항
        int series = a + (n - 1) * d; // 등차수열의 일반 항 공식

        System.out.println(series);
    }
}
