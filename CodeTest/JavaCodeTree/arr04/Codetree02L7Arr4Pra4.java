import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 감기 증상에 대한 진료소 메모

        /* 증상 o, >= 37c - A
          증상 x, >= 37c - B
          증상 o, 정상 - C
          둘다  OK - D */

        // 3명의 사람을 검사,
        // if A >= 2 - E

        // 입력되는 값 - 증상여부 Y/N 온도

        Scanner scanner = new Scanner(System.in);
        String[] memo = new String[6];
        for(int i = 0; i < 6; i++) {
            String str = scanner.nextLine();
            String[] arr = str.split(" ");
            memo[i] = arr[0];
            memo[++i] = arr[1];
        }

        int printData[] = new int[4];
        int cnt = 0;
        for(int j = 0; j < 6; j++) {
            String symptom = memo[j];
            int temp = Integer.parseInt(memo[++j]);

            if(symptom.equals("Y") && temp >= 37) {
                printData[0]++;
                cnt++;
            } else if (symptom.equals("N") && temp >= 37) {
                printData[1]++;
            } else if (symptom.equals("Y") && temp < 37) {
                printData[2]++;
            } else {
                printData[3]++;
            }
        }

        // 출력
        for(int p : printData) {
            System.out.print(p + " ");
        }
        if(cnt >= 2) {
            System.out.print("E");
        }
    }
}