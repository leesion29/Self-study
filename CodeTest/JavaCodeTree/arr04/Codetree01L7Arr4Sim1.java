import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 원소의 개수
        int[] cnt = new int[10]; // 0~9 인덱스를 사용할 배열

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            cnt[num]++; // 해당 숫자에 대한 카운트 증가
        }

        // 1부터 9까지 출력
        for (int i = 1; i <= 9; i++) {
            System.out.println(cnt[i]);
        }
    }
}
