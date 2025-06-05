import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 교실 학생 수 < 10
        // 학생 시험 종류 = 4
        // if 평균 점수 >= 60 -> pass;
        // else fail;
        // 최종 통과 학생 수 출력
        Scanner sc = new Scanner(System.in);

        // 학생 수
        int stu = sc.nextInt();

        // 변수 선언
        ArrayList<Integer> score = new ArrayList<>();
        ArrayList<Float> avg = new ArrayList<>();

        // 성적 저장
        for (int i = 0; i < (stu*4); i++) {
            score.add(sc.nextInt());
        }
        

        // 평균 구하기
        int cnt = 1; // 학생 단위 쪼개기
        int sum = 0; // 합
        int stuCnt = 1;
        for (int s : score) {
            if (cnt <= 4) {
                sum += s;
                // 마지막 학생인 경우 처리
                if ((cnt == 4) && (stuCnt == stu)){
                    float stuAvg = Math.round((sum*10.0f)/4.0f)/10.0f;
                    avg.add(stuAvg);
                }
                cnt++;
            } else {
                float stuAvg = Math.round((sum*10.0f)/4.0f)/10.0f;
                avg.add(stuAvg);
                cnt = 1;
                sum = 0;
                sum += s;  
                cnt++;
                stuCnt++;
            }
        }

        // 등급 책정
        stuCnt = 0;
        for (float f : avg) {
                if (f >= 60) {
                System.out.println("pass");
                stuCnt++;
            } else {
                System.out.println("fail");
            }
        }
        // 통과 학생 수
        System.out.println(stuCnt);
    }
}