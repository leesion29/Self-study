import java.util.Scanner;

public class Ans92TogetherSolveDay {
	public static void main(String[] args) {
		// 같은 날 동시에 가입한 3명의 사람들이 온라인 채점시스템에 들어와 문제를 푸는 날짜가
		// 매우 규칙적이라고 할 때, 다시 모두 함께 문제를 풀게 되는 그날은 언제일까?
		// 예를 들어 3명이 같은 날 가입/등업하고, 각각 3일마다, 7일마다, 9일마다
		// 한 번씩 들어온다면, 처음 가입하고 63일 만에 다시 3명이 함께 문제를 풀게 된다.

		Scanner sc = new Scanner(System.in);

		int day = 1;

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		while(day%a!=0 || day%b!=0|| day%c!=0) {
			day++;
		}
		System.out.println(day);

	}
}
