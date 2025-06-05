import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 학생 8명의 점수가 주어지면 평균을 출력하는 프로그램 작성
        // 소수 첫째자리까지 출력
        Scanner sc = new Scanner(System.in);
        float[] arr = new float[8];
        float sum = 0;
        for (int i = 0; i<arr.length;i++){
            arr[i] = sc.nextFloat();
            sum += arr[i];
        }
        
        System.out.println(Math.round(sum*10.0f/(float) arr.length)/10.0f);
    }
}