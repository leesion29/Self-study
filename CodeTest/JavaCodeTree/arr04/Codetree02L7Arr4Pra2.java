import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 세 자리 미만의 정수 n이 입력된다.
        // if n == 0 이라면
        // 그 0을 제외하고 그 때까지 입력된 정수의
        // 십의 자리 수를 출력하라

        int[] number = new int[101];
        int i = 0;

        // 0이 입력될 때까지 숫자를 입력받는다
        while(true) {
            int n = sc.nextInt();
            if(n == 0) {
                break;
            } else {
                number[i] = n;
                i++;
            }
        }

        // 십의 자리 숫자 카운트
        int[] cnt = new int[10];
        for(int j = 0; j < i; j++) {
            int k = number[j]/10;
            cnt[k]++;
        }

        // 출력
        for(int m = 1; m < cnt.length; m++) {
            System.out.println(m + " - " + cnt[m]);
        }
    }
}