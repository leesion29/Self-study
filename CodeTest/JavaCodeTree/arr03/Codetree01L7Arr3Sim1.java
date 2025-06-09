import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 제곱하여 출력
        // 입력한 만큼의 원소들을 각각 제곱하여 출력하시오.
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        int nums;
        for(int i = 0; i < n; i++) {
            nums = sc.nextInt();
            list.add(nums);
        }

        for(int i : list) {
            System.out.print(i * i + " ");
        }
    }
}