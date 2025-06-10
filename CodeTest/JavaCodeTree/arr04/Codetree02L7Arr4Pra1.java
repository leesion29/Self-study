import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 주사위를 10번 던졌을 때, 
        // 각 숫자를 카운팅 하라
        int[] dice = new int[10];
        int[] cnt = new int[7];
        for(int i = 0; i < dice.length; i++) {
            int num = sc.nextInt();
            dice[i] = num;
            cnt[num]++;
        }

        for(int i = 1; i <= 6; i++) {
            System.out.println(i + " - " + cnt[i]);
        }
    }
}