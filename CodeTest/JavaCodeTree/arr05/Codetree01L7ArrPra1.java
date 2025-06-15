import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 6개의 문자 배열을 만들고
        // 각각 L, E, B, R, O, S를 대입한다.
        // 그 다음 찾을 문자를 입력받고,
        // 그 위치를 출력, 없으면 None을 출력한다.

        String[] str = {"L", "E", "B", "R", "O", "S"};
        int idx = -1;
        String findWord = sc.next();
        for(int i = 0; i < str.length; i++) {
            if(str[i].equals(findWord)) {
                idx = i;
            }
        }

        if (idx == -1) {
            System.out.println("None");
        } else {
            System.out.println(idx);
        }
    }
}
