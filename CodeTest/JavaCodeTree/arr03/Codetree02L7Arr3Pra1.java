import java.util.*;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 원소의 개수를 입력받고,
        // 그 중 짝수인 값만 출력한다
        // 단, 짝수인 값을 새로운 배열에 저장한다.
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        List<Integer> even = list.stream()
                                      .filter(i -> i % 2 == 0)
                                      .collect(Collectors.toList());
        for(int e : even) {
            System.out.print(e + " ");
        }

    }
}