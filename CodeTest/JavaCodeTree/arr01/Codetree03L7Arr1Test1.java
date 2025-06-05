import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 주어진 정수 중에서
        // 짝수만 출력
        // 단, 그 짝수는 역순으로 출력되어야 한다.
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        // 첫 줄에는 정수의 개수를 받는다.
        int cnt = sc.nextInt();

        // 그 다음 정수를 받는다.
        for(int i = 0; i < cnt; i++) {
            int n = sc.nextInt();
            if(n%2==0){
                nums.add(n);
            }
        }

        // 배열을 역순으로 변경한다.
        Collections.reverse(nums);

        // 출력한다.
        for(int i : nums) {
            System.out.print(i + " ");
        } 
    }
}