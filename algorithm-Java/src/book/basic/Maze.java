package book.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Maze {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        //¸Ê »ý¼º
        int[][] maze = new int[9][8];
        for(int i = 0; i < 9; i++) {
            String line = bf.readLine();
            for(int j = 0; j < 8; j++) {
                String temp = line.substring(j, j+1);
                maze[i][j] = Integer.parseInt(temp);
            }
        }
        
        Stack<Integer> visitedMap = new Stack<>();
        
        Position cur = new Position(0, 0);
        
        int initDir = 0;
        
        while(true) {
            maze[cur.y][cur.x] = 2;
            if(cur.x == 7 & cur.y == 8) {
                System.out.println("Found the path");
                break;
            }
            
            boolean forwarded = false;
            for(int dir = initDir; dir < 4; dir++) {
                if(movable(cur, dir, maze)) {
                    visitedMap.push(dir);
                    cur = move(cur, dir);
                    forwarded = true;
                    initDir = 0;
                    break;
                }
            }

            if(!forwarded) {
                maze[cur.y][cur.x] = 3;

                if(visitedMap.isEmpty()) {
                    System.out.println("No path Exists");
                    break;
                }
                
                int d = visitedMap.pop();
                cur = move(cur, (d+2)%4);
                initDir = d+1;
            }
            
        }
        
        
        
    }
    
    public static boolean movable(Position cur, int dir, int[][] maze) {
        boolean result = false;
        
        int x = cur.x;
        int y = cur.y;
        
        //ºÏ
        if(dir == 0) {
            if(y == 0) 
                return false;
            else if(maze[y-1][x] == 0)
                return true;    
        }
        
        
        //µ¿
        else if(dir == 1) {
            if(x == 7) 
                return false;
            else if(maze[y][x+1] == 0)
                return true;    
        }
        
        
        //³²
        else if(dir == 2) {
            if(y == 8) 
                return false;
            else if(maze[y+1][x] == 0)
                return true;    
        }
        
        //¼­
        else if(dir == 3) {
            if(x == 0) 
                return false;
            else if(maze[y][x-1] ==0)
                return true;    
        }
        
        
        return result;
    }
    
    public static Position move(Position cur, int dir) {

        //ºÏ
        if(dir == 0) {
            cur.y -= 1;
            return cur;
        }
        //µ¿
        else if(dir == 1) {
            cur.x += 1;
            return cur;
        }
        //³²
        else if(dir == 2) {
            cur.y += 1;
            return cur;
        }
        //¼­
        else if(dir == 3) {
            cur.x -= 1;
            return cur;
        }
        return cur;
    }
    
    public static void printMaze(int[][] map) {
        for(int i = 0; i < 9; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < 8; j++) {
                sb.append(map[i][j]);
            }
            System.out.println(sb);
        }
    }


    public static class Position {
        private int x;
        private int y;
        
        public Position(int y, int x) {
            this.x = x;
            this.y = y;
        }

     
    }

}
