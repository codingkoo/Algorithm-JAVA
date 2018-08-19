package swea;

import java.util.Scanner;

public class swea_1954_snail {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int i = 0; i < T; i++) {
            int N = scan.nextInt();
            int[][] map = new int[N][N];
            int count = 1;
            
            
            //지도생성
            for(int j = 0; j<N; j++) {
               for(int k = j; k < N-j; k++) {
                   map[j][k] = count;
                   count++;
               }
               for(int k = j+1; k < N-j; k++) {
                   map[k][N-j-1] = count;
                   count++;
               }
               for(int k = j+1; k < N-j; k++) {
                   map[N-j-1][N-1-k] = count;
                   count++;
               }
               for(int k = j+2; k < N-j; k++) {
                   map[N-k][j] = count;
                   count++;
               }
            }
            
            System.out.println("#"+i);
            
            for(int j = 0; j < N; j++) {
                StringBuilder sb = new StringBuilder();
                for(int k= 0; k < N; k++) {
                    if(k == N-1) {
                        sb.append(map[j][k]);
                    } else {
                        sb.append(map[j][k]);
                        sb.append(" ");
                    }
                }
                System.out.println(sb.toString());
            }
        }
        scan.close();
    }
}
