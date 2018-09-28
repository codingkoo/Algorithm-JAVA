package boj;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_1525_Puzzle {
    //³²ºÏµ¿¼­
    public static final int[] dx = {0, 0, 1, -1}; 
    public static final int[] dy = {1, -1, 0, 0};
            
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 3;
        int[][] map = new int[n][n];
        
        int start = 0;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                map[i][j] = scan.nextInt();
                
                if(map[i][j] == 0) {
                    map[i][j] = 9;
                }
                
                start = (start * 10) + map[i][j];
                
            }
        }
        scan.close();
        
        Queue<Integer> q = new LinkedList<>();
        
        q.add(start);
        
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        
        hashMap.put(start, 0);
        
        while(!q.isEmpty()) {
            int nowNum = q.poll();
            if(nowNum == 123456789) {
                break;
            }
            String now = Integer.toString(nowNum);
            int zeroPos = now.indexOf('9');
            int x = zeroPos % 3;
            int y = zeroPos / 3;
            
            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx >= 0 & nx < n & ny >= 0 & ny < n) {
                    StringBuilder next = new StringBuilder(now);
                    char temp = next.charAt(x+3*y);
                    next.setCharAt(x+3*y, next.charAt(nx+3*ny));
                    next.setCharAt(nx+3*ny, temp);
                    int num = Integer.parseInt(next.toString());
                    if (!hashMap.containsKey(num)) {
                        hashMap.put(num, hashMap.get(nowNum)+1);
                        q.add(num);
                    }
                }
            }
        }
        
        if(hashMap.containsKey(123456789)) {
            System.out.println(hashMap.get(123456789));
        } else {
            System.out.println(-1);
        }
        
    }

}
