import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 정수 10개 입력 받기
        // 합과 평균 출력
        // 단, 0 입력 시, 무조건 종료
        // 0 제외한 합과 평균을 구한다.
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        int c = 0;
        for(int i = 0; i < 10; i++){
            int n = sc.nextInt();
            list.add(n);
            sum += n;
            
            if(n == 0){
                // 종료
                i = 10;
            } else {
                c++;
            }
        }
        float avg = Math.round((sum*10.0f) /(float)c)/10.0f;

        System.out.println(sum + " " + avg);
    }
}