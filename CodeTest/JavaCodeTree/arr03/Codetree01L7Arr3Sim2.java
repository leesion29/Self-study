import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 10 미만의 정수 2개를 입력받는다.
        // 각각 순서대로 1번째 항, 2번째 항이다.
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(x); // 0
        list.add(y); // 1

        // 3번째 항부터는 두 이전 항끼리의 합을 더한 값의 첫 번째 자리로 채운다.
        // [2] = [0]+[1], [3] = [1]+[2], [4] = [2] + [3]
        int z;
        for(int i = 2; i < 10; i++){
            z = (list.get(i-2) + list.get(i-1)) % 10;
            list.add(z);
        }
        

        // 10개를 차례로 출력한다.
        for(int i : list) {
            System.out.print(i + " ");
        }
    }
}