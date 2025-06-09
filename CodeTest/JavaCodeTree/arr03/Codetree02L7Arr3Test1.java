import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 첫 번째 항과 두 번째 항이 주어졌을 때
        // 10번째 항까지 구하는 프로그램 작성
        // 단, 세 번째 항부터 A[n] = A[n-1] + 2 * A[n-2]를 만족해야 한다.

        // 항 입력
        int x = sc.nextInt();
        int y = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        list.add(x);
        list.add(y);

        for(int i = 2; i < 10; i++) {
            int z = list.get(i-1) + 2*(list.get(i-2));
            list.add(z);
        }

        for(int li : list) {
            System.out.print(li + " ");
        }
    }
}
