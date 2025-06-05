import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> seq = new ArrayList<>();
        int sum = 0;
        float avg = 0.0f;

        for(int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            seq.add(n);
            if(!(i%2==0)) {
                sum += n;
            }

        }

        // 짝수 번째로 입력된(인덱스 번호가 홀수인) 값의 합
        System.out.print(sum + " ");

        // 3의 배수 번째로 입력된 (2, 5, 8번째 인덱스) 값의 평균
        sum = seq.get(2) + seq.get(5) + seq.get(8);
        avg = Math.round(sum*10.0f/3.0f)/10.0f;
        System.out.print(avg);

    }

}