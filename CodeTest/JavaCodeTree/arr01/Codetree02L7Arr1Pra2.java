import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 10개의 정수를 저장할 수 있는 배열 선언, 10개의 정수를 차례로 입력
        // 0이 입력된 경우, 10개 X여도 종료.
        // 출력할 때, 역순으로 출력.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] == 0) {
                // 종료
                i = arr.length;
            }
        }

        for(int i = arr.length-1; i > -1; i--) {
            if(arr[i] != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}