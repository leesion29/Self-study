import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        // 500 이하의 정수 10번 주어짐
        // 만약 정수 250 이상? 그 수를 제외하고
        // 모든 정수의 합계와 평균 구한다.
        // 단, 250 이상의 정수가 없다면 10개의 합계와 평균을 구한다.

        int[] arr = new int[10];
        int sum = 0;
        float avg = 0;
        int len = arr.length;
        int cnt = 0;

        for (int i = 0; i < len; i++){ 
            arr[i] = sc.nextInt();
            if (arr[i] < 250) {
                sum += arr[i];
                cnt++;
            } else {
                i = len;
            }
        }
        avg = Math.round((sum * 10.0f) / (float)cnt) / 10.0f;
        System.out.println(sum + " " + avg);
    }
}