import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 과목 수 N이 주어짐.
        // 입력 - 과목의 수, 해당 수만큼의 과목 학점
        // Perfect : 4.0>=, Good : 3.0>=, poor : 3.0<
        int n = sc.nextInt();
        float[] arr = new float[n];

        // 학점 저장
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextFloat();
        }

        float sum = 0;
        // 평균 학점 계산
        for (float f : arr) {
            sum += f;
        }
        float avg = Math.round(sum * 10.0f/(float) n)/10.0f;

        // 출력
        System.out.println(avg);
        if (avg >= 4.0){System.out.println("Perfect");}
        else if (avg >= 3.0){System.out.println("Good");}
        else {System.out.println("Poor");}
    }
}