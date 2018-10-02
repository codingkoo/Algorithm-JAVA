package boj;

import java.util.Scanner;

public class BOJ_9095_sum123 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int t = 0; t < T; t++) {
            int goal = scan.nextInt();
            int answer = go(0, 0, goal); 
            System.out.println(answer);
        }
    }
    
    public static int go(int count, int sum, int goal) {
        if(sum > goal) return 0;
        if(sum == goal) return 1;
        int now = 0;
        for(int i = 1; i<=3; i++) {
            now += go(count+1, sum+i, goal);
        }
        return now;
        
    }
}
