import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 10개의 문자 입력 받기
        // 2, 5, 8 번째 입력을 차례로 출력
        // 인덱스 1, 4, 7
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            list.add(sc.next());
        }
        System.out.println(list.get(1) + " " + list.get(4) + " " + list.get(7));
    }
}