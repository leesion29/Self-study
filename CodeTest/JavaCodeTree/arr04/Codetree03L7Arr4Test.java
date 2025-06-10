import java.util.*;
public class Main {
    public static void main(String[] args) {
    // 두 정수 A와 B에 대해, A가 1보다 클 동안 B로 계속 나눈다
    // 이 과정에서 나오는 나머지들의 종류별 개수를 각각 구한 뒤,
    // 각 개수를 제곱하여 모두 더한 값을 출력한다.
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        while (a > 1) {
            int c = a/b;
            int d = a%b;
            list.add(d);
            a = c;
        }

        int[] cnt = new int[10];
        for(int i : list) {
            cnt[i]++;
        }

        int sum = 0;
        for(int c : cnt) {
            if(c != 0) {
                sum += c*c;
            }
        }
        System.out.println(sum);
    }
}