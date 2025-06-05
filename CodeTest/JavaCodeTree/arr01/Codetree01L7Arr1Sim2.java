import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 10개를 받아 역순으로 출력한다.
        Scanner sc = new Scanner(System.in);
        String[] str = new String[10];
        for(int i = 0; i < 10; i++) {
            str[i] = sc.next();
        }
        for(int i = str.length-1; i!=-1; i--){
            System.out.print(str[i]);
        }
    }
}