package swea;

import java.util.Scanner;
         
public class swea_1859_millionaire_2 {
    static int n, count, max;
     
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
         
        int T = sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            long sum = 0;
             
            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
             
            int max = arr[n - 1];
             
            for(int i = n - 2; i >= 0; i--) {
                if(arr[i] > max) {
                    max = arr[i];
                    continue;
                }
                sum += max - arr[i];
            }
             
            System.out.println("#" + test_case + " " + sum);
        }
        sc.close();
    }
}