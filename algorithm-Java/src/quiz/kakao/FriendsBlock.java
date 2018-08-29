package quiz.kakao;

public class FriendsBlock {

    public static void main(String[] args) {
        String[] test = {"CCBDE", "AAADE", "AAABF", "CCBBF"};
        System.out.println(solution(4, 5, test));

    }
    
    public static int solution(int m, int n, String[] board) {

        String[][] map = new String[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                map[i][j] = board[i].substring(j, j+1);
            }
        }
        String[][] cloneMap = new String[m][n];
        
        //1회차
        checkBlock(m, n, map, cloneMap);
        int sum = pangBlock(m, n, cloneMap);
        cleanMap(m, n, map, cloneMap);
        pullDownMap(m, n, map);
        
        //2회차 ~ n회차
        checkBlock(m, n, map, cloneMap);
        while(pangBlock(m,n,cloneMap)!=0) {
            sum += pangBlock(m,n,cloneMap);
            cleanMap(m, n, map, cloneMap);
            pullDownMap(m, n, map);
            checkBlock(m, n, map, cloneMap);
        }
        
        
        return sum;
    }
    
    public static void checkBlock(int m, int n, String[][] map, String[][] cloneMap) {
            for(int y = 0; y < m-1; y++) {
                for(int x = 0; x <n-1; x++) {
                    if(map[y][x] == null | map[y+1][x] == null | map[y][x+1] == null | map[y+1][x+1] == null) {
                        //null 처리를 위한 부분. 암것두 안함. 그러나 명시해주지 않으면 nullPointException이 일어남.
                    } else if(map[y][x].equals(map[y][x+1]) & map[y][x].equals(map[y+1][x]) & map[y][x].equals(map[y+1][x+1])) {
                        cloneMap[y][x] = "X";
                        cloneMap[y][x+1] = "X";
                        cloneMap[y+1][x] = "X";
                        cloneMap[y+1][x+1] = "X";  
                    }
                }
            }
    }
    
    public static int pangBlock(int m, int n, String[][] cloneMap) {
        int pang = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(cloneMap[i][j] == null) {
                    continue;
                } else if(cloneMap[i][j].equals("X")) {
                    pang += 1;
                }
            }
        }
        return pang;
    }
    
    public static void cleanMap(int m, int n, String[][] map, String[][] cloneMap) {
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(cloneMap[i][j] == null) {
                    continue;
                }else if(cloneMap[i][j].equals("X")) {
                    cloneMap[i][j] = null;
                    map[i][j] = "";
                }
            }
        }
    }
    
    public static void pullDownMap(int m, int n, String[][] map) {
        for(int i = m-1; i >= 0; i--) {
            for(int j=n-1; j >=0; j--) {
                if(map[i][j] == null) {
                    continue;
                }else if(map[i][j].equals("")) {
                    String temp ="temp";
                    for(int k=i; k>=0; k--) {
                        if(map[k][j] == null) {
                            break;
                        } else if(!map[k][j].equals("")) {
                            temp = map[k][j];
                            map[k][j] = "";
                            break;
                        } else {
                            temp = null;
                        }
                    }
                    map[i][j] = temp;
                } else {
                    continue;
                }
            }
        }
    }
}
