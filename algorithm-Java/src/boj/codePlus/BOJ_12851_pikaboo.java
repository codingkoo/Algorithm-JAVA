package boj.codePlus;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_12851_pikaboo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        scan.close();
        int MAX = 200000;
        int dist[] = new int[MAX];
        boolean check[] = new boolean[MAX];
        
        Queue<Integer> q = new LinkedList<>();
        q.add(N);
        dist[N] = 0;
        while(!q.isEmpty()) {
            int now = q.poll();
            
            if(now == K) {
                break;
            }
            
            if(now - 1> 0) {
                if(check[now-1] == false) {
                    dist[now-1] = dist[now] + 1;
                    check[now] = true;
                    q.add(now-1);
                }
            }
            
            if(now+1 < MAX) {
                if(check[now+1] == false) {
                    dist[now+1] = dist[now] + 1;
                    check[now+1] = true;
                    q.add(now+1);
                }
            }
            
            if(check[now*2] == false) {
                dist[now*2] = dist[now] + 1;
                check[now*2] = true;
                q.add(now * 2);
            }
        }
        System.out.println(dist[K]);
    }

}
