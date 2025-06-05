import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 10개의 정수 입력받기
        // 세 번째, 다섯 번째, 열 번째 정수의 합을 출력
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            nums.add(sc.nextInt());
        }
        int sum = nums.get(2) + nums.get(4) + nums.get(9);
        System.out.println(sum);
    }
}