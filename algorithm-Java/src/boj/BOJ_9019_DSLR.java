package boj;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_9019_DSLR {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        
        int T = scan.nextInt();
        for(int t = 1; t <= T; t++) {
            int startNum = scan.nextInt();
            int endNum = scan.nextInt();
            
            boolean[] check = new boolean[10000];
            String[] commands = new String[10000];
            
            Queue<Integer> q = new LinkedList<>();
            
            q.add(startNum);
            check[startNum] = true;
            commands[startNum] = "";
            
            while(!q.isEmpty()) {
                int temp = q.poll();
                
                if(temp == endNum)
                    break;
                
                bfs(temp, q, check, commands);
            }
            
            System.out.println(commands[endNum]);
        }
        
        scan.close();
    }
    
    public static void bfs(int temp, Queue<Integer> q, boolean[] check, String[] commands) {

        //D연산
        int d = temp * 2;
        if(d > 9999) {
            d = d % 10000;
        }
        if(check[d] == false) {
            q.add(d);
            check[d] = true;
            commands[d] = commands[temp] + "D";
        }
        
        //S연산
        int s = temp-1;
        if(s == -1) s = 9999;
        if(check[s] == false) {
            q.add(s);
            check[s] = true;
            commands[s] = commands[temp] + "S";
        }
        
        //L연산
        int L = (temp % 1000) *10 + temp/1000;
        if(check[L] == false) {
            q.add(L);
            check[L] = true;
            commands[L] = commands[temp] + "L";
        }
        
        //R연산
        int R = (temp / 10) + (temp%10)*1000;

        if(check[R] == false) {
            q.add(R);
            check[R] = true;
            commands[R] = commands[temp] + "R";
        }

    }

}