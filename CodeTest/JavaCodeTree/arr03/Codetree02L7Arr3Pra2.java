import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1 ~ 10 까지 정수를 입력받고
        // 그 배수를 출력하다가
        // 5의 배수가 2번 출력되면 종료되는
        // 프로그램을 만드시오.

        int isMultiple = 0;
        int n = sc.nextInt();
        int i = 1;
        List<Integer> list = new ArrayList<>();

        while(isMultiple != 2) {
            int res = n*i;
            list.add(res);
            i++;
            if(res%5 == 0) {
                isMultiple++;
            }
        }

        for(int li : list) {
            System.out.print(li + " ");
        }
    }
}