import java.util.*;
public class Main {
    public static void main(String[] args) {
        // N개의 원소와 Q개의 질의가 주어진다.

        // # 입력
        // 첫 줄의 입력은 원소의 수, 질의의 수이다.
        // 둘째 줄에는 배열을 입력한다.
        // 이후에는 질의가 입력된다.

        // # 질의의 종류 : 앞의 숫자로 구분된다. 예> 1 10이면 질의 1이다.
        // 타입1> 1 a : a번째 원소를 출력한다.
        // 타입2> 2 b : N개의 원소에서 b 값을 탐색하여 인덱스 출력한다.
        // 중복인 경우 작은 것을 출력한다. 없다면 0을 출력한다.
        // 타입3> 3 s e : s ~ e까지 각 원소의 값을 공백으로 구분하여 차례로 출력한다.

        /* # 입력 예시
            5 5 // N과 Q
            3 2 4 5 4 // 배열
            1 4 // 질의 1
            2 4 // 질의 2
            2 5 // 질의 3
            3 1 5 // 질의 4
            3 2 5 // 질의 5
        */
        Scanner sc = new Scanner(System.in);
        
        // 원소의 수 / 질의의 수
        int n = sc.nextInt();
        int q = sc.nextInt();
        // 배열의 수
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<q; i++) {
            int type = sc.nextInt();
            // 질의 타입 1
            if(type == 1) {
                int idx = sc.nextInt();
                System.out.println(arr[idx-1]);
            }
            // 질의 타입 2
            if(type == 2) {
                int findB = sc.nextInt();
                int isB = 0;
                boolean isFind = false;
                for(int j = 0; j<n; j++) {
                    if(arr[j] == findB && isFind == false) {
                        isB = j+1;
                        isFind = true;
                    }
                }
                System.out.println(isB);
            }
            // 질의 타입3
            if(type == 3) {
                int start = sc.nextInt() -1;
                int end = sc.nextInt();
                for(int j = start; j<end; j++){
                    System.out.print(arr[j]+" ");
                }
                System.out.println();
            }
        }
    }
}