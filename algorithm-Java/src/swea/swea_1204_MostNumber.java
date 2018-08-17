package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_1204_MostNumber {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int students = 1000;    //학생수
        int T = Integer.parseInt(bf.readLine());    //테스트 케이스 개수
        String[] nums = new String[T];  //테스트 케이스 번호

        for(int i=0; i < T; i++) {
            int[] scores = new int[101]; //0~100점까지의 배열을 만들고,    
            for(int a=0; a < scores.length; a++) {  //그 배열의 값을 전부 0으로 초기화함
                scores[a] = 0;
            }
            nums[i] = bf.readLine();
            String s = bf.readLine();
            StringTokenizer st = new StringTokenizer(s);
            
            int max = 0;
            int maxTick = 0;
            // 각 성적을 차례차례 읽어들여서 해당 성적 배열(scores[])의 카운트를 1씩 올려줌
            for(int k=0; k<students; k++) {
                int tick = Integer.parseInt(st.nextToken(" "));
                scores[tick] = scores[tick] + 1;
            }
            
            // 모든 배열을 탐색하며 scores[f]의 값이 가장 높은 수를 찾음. 그것이 곧 최빈수. 
            for(int f=0; f<scores.length; f++) {
                // 같은 빈도로 출현할 경우, 값이 큰 성적을 출력해야 하므로, max<=scores[f]
                if(max <= scores[f]) {
                    max = scores[f];
                    maxTick = f;
                }
            }
            System.out.println("#" + nums[i] + " " + maxTick);  //예 : #1 71
        }
        bf.close();
        }
}