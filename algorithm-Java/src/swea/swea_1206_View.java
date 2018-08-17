package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_1206_View {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for(int t = 0; t < 10; t++) { //테스트 케이스는 10개로 고정되어있다.
            int width = Integer.parseInt(bf.readLine());
            int map[][] = new int[width][256];  //전체 지도
            int heightSet[][] = new int[width][1];  //x별 높이(height) 정보
            
            String line = bf.readLine();
            StringTokenizer st = new StringTokenizer(line);
            
            for(int x = 0; x < width; x ++) {
                int height = Integer.parseInt(st.nextToken(" "));
                heightSet[x][0] = height;
                for(int y = 0; y < height; y++) {
                    map[x][y] = 1;
                }
            }
            
            int niceView = 0;
            
            //양옆은 전부 0 0 , ... , 0 0 이므로 탐색할 필요가 없음
            for(int x = 2; x < width-2; x++) {
                int height = heightSet[x][0];
                for(int y = 0; y < height; y++) {
                    if(map[x-1][y] == 1 | map[x-2][y] == 1 | map[x+2][y] == 1 | map[x+1][y] == 1) {
                        continue;
                    } else {
                        niceView += 1;
                    }
                }
            }
            
            System.out.println("#" + (t+1) + " " + niceView);
        }
    }
}
               
            