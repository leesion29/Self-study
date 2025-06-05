import java.util.*;
public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ArrayList<Integer> list = new ArrayList<>();
            int sum = 0;
            int n;
            do{
                 n = sc.nextInt();
                if (n != 0) {
                    sum += n;
                    list.add(n);
            } 
        } while(n != 0);
        int len = list.size()-1;
        n = 1;
        sum = 0;
        while (len >= 0) {
            sum += list.get(len);
            len = len -1;
            n++;
            if (n > 3) {
                break;
            }
        }
        System.out.println(sum);
    }
}