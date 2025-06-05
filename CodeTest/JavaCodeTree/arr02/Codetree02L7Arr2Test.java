import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 3의 배수가 주어지는 바로 앞 원소를 출력한다.
        ArrayList<Integer> list = new ArrayList<>();
        boolean isPrint = false;
        for(int i = 0; i< 10; i++) {
            int n = sc.nextInt();
            list.add(n);
            if(n % 3 == 0 && isPrint == false) {
                System.out.println(list.get(i-1));
                isPrint = true;
            }
        }
    }
}