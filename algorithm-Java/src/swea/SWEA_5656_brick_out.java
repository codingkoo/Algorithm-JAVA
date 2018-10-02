package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class SWEA_5656_brick_out {
    
    public final static int[] dx = {0, 0, 1, -1};
    public final static int[] dy = {1, -1, 0, 0};
    public static int N;
    public static int W;
    public static int H;
    public static int[][][] map;
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        for(int t = 1; t <=T; t++) {
            String cases = bf.readLine();
            StringTokenizer st = new StringTokenizer(cases, " ");
            N = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());
            H = Integer.parseInt(st.nextToken());
            int sum = 0;
            int ans = 0;
            
            map = new int[N+1][H][W];
            
            for(int h = 0; h < H; h++) {
                String tempLine = bf.readLine();
                StringTokenizer st2 = new StringTokenizer(tempLine, " ");
                for(int w = 0; w < W; w++) {
                    map[0][h][w] = Integer.parseInt(st2.nextToken());
                    if(map[0][h][w] > 0)
                        sum += 1;
                }
                
            }
            ans = sum - run(1);
            System.out.println("#" + t + " " + ans);
        }
    }
    
    public static int run(int depth) {
        //종료조건
        if(depth > N) {
            return 0;
        }
        int ans = 0;
        int temp = 0;
        for(int w = 0; w < W; w++) {
            copyMap(depth);
            boolean check = false;
            for(int h = 0; h < H; h++) {
                if(map[depth][h][w] != 0) {
                    check = true;
                    temp = dfs(depth, h, w);
                    break;
                }
            }
            if(check == false) continue;
            dropMap(depth);
            ans = Math.max(ans, run(depth+1) + temp);
        }
        return ans;
    }
    
    public static void copyMap(int depth) {
        for(int w = 0; w < W; w++) {
            for(int h = 0; h < H; h++) {
                map[depth][h][w] = map[depth-1][h][w];
            }
        }
    }
    
    public static void dropMap(int depth) {
        Queue<Integer> q = new LinkedList<>();
        for(int w = 0; w < W; w++) {
            for(int h = H-1; h >=0; h--) {
                if(map[depth][h][w] != 0) {
                    q.add(map[depth][h][w]);
                    map[depth][h][w] = 0;
                }
            }
            
            for(int h = H-1; h >=0; h--) {
                if(!q.isEmpty()) {
                    map[depth][h][w] = q.poll();
                }
            }
        }
    }
    public static int dfs(int depth, int h, int w) {
        int count = 1;
        int power = map[depth][h][w];
        map[depth][h][w] = 0;
        for(int p = 1; p < power; p++) {
            for(int d = 0; d < 4; d++) {
                int nx = w + dx[d] * p;
                int ny = h + dy[d] * p;
                
                if(nx < 0 || ny < 0 || nx >= W || ny >= H || map[depth][ny][nx] == 0) {
                   continue;
                }
                count += dfs(depth, ny, nx);                
            }   
        }
        return count;
    }
}

