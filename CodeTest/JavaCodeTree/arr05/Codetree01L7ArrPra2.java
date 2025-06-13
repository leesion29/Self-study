import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 정수 N이 주어지면 그 수만큼 숫자가 입력
        // 그 중 특정 숫자 M의 등장 수를
        // 카운트 하는 코드를 작성하라
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[100];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == m)
                cnt++;
        }

        System.out.print(cnt);
    }
}
