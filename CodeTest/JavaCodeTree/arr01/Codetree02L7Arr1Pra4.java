import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 10개의 정수 입력
        // 0이 주어지기 전까지 2의 배수의 개수, 합계를 출력하시오.
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0; // 합계용
        int cnt = 0; // 카운트용

        while(cnt < 10) {
            int n = sc.nextInt();
            list.add(n);
            cnt++; // 조건문 카운트
            if(n == 0) {
                break;
            }
        }

        cnt = 0; //2의 개수 카운트
        for(int i : list) {
            if(i % 2 == 0 && i!=0) { // 0 제외
                cnt++;
                sum += i; //합계
            }
        }
        System.out.println(cnt + " " + sum); // 출력
    }
}