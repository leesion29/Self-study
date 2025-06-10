import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 100명 이하 학생이 있다.
        // 점수가 주어지다가 0이 주어지면
        // 주어진 점수를 10점 단위로 구분하여
        // 점수대별 학생 수를 출력한다.
        
        int[] scoreList = new int[101];
        int score;
        int i = 0;
        // 데이터 입력
        do{
            score = sc.nextInt();
            if(score != 0) {
                scoreList[i] = score;
                i++;
            }
        } while(score != 0);

        // 구분
        int[] div = new int[101];

                for(int j = 0; j < scoreList.length; j++) {
                    if (scoreList[j] == 0) {
                        j = scoreList.length;
                    } else {
                        if(scoreList[j] != 100) {
                            div[scoreList[j]/10 * 10]++;
                        } else {
                            div[scoreList[j]/100 * 100]++;
                        }
                    }
                }
 
        // 출력
        for(int k = 100; k >= 10; k -= 10){
            System.out.println(k + " - " + div[k]);
        }
    } 
}