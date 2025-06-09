import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 최대 100개의 정수가 첫 줄에 입력된다
        // 0이 주어지면
        // 1. 0을 제외
        // 2. 그 수가 홀수면 +3의 값,
        // 혹은 짝수라면 나눈 몫을 출력하는 프로그램을 작성한다.

        List<Integer> list = new ArrayList<>();
        int n;
        do{
            n = sc.nextInt();
            if(n != 0) {
                list.add(n);
            }
        } while(n != 0);

        for(int i : list) {
            if(i%2 == 0) {
                i = i/2;
            } else{
                i += 3;
            }
            System.out.print(i + " ");
        }
    }
}
