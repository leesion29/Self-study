import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. 정수를 입력 받는다.
        // 2. 그 정수를 1번째 인덱스에 두고, 0번째 인덱스에는 1을 둔다.
        // 3. 세번째 항부터는 전전항 + 전항으로 더한 수로 채운다.
        // 단, 100을 넘길 때까지만 출력한다.

        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(n);

        int i = 2;
        while(true){
            int seq = list.get(i-2) + list.get(i-1);
            list.add(seq);

            if(seq >= 100) {
                break;
            }
            i++;
        }

        for(int li : list) {
            System.out.print(li + " ");
        }  
    }
}