import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // 10개의 원소가 주어졌을 때, 주어진 것들의 합을 출력한다.
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            arr[i] =  sc.nextInt();
        }

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum);
    }
}