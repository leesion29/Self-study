import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 홀수 번째 입력받은 정수의 합과(인덱스 짝수)
        // 짝수 번째 입력받은 정수의 합(인덱스 홀수)
        // 큰 수 - 작은 수의 값을 출력

        // 0. 변수 선언 및 값 저장.
        Scanner sc = new Scanner(System.in);
        int sum1 = 0;
        int sum2 = 0;
        int calc = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            // 1. 각각의 정수의 합을 구한다.
            int n = sc.nextInt();
            list.add(n);
            if(i%2==0){
                sum1 += n;
            } else {
                sum2 += n;
            }
        }
        
        // 2. 어떤 것이 큰 수인지 체크 및 연산
        if(sum1 > sum2) {
            calc = sum1 - sum2;
        } else {
            calc = sum2 - sum1;
        }
        // 3. 연산된 값을 출력한다.
        System.out.println(calc);
    }
}