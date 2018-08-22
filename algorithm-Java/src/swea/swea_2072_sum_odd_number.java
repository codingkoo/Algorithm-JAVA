package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_2072_sum_odd_number {

    public static void main(String[] args) throws IOException, NumberFormatException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(bf.readLine());
        for(int i = 1; i<=T; i++) {
            String s = bf.readLine();
            StringTokenizer st = new StringTokenizer(s, " ");
            int sum = 0;
            while(st.hasMoreTokens()) {
                String temp = st.nextToken();
                if(temp == "1"){
                    sum += 1;
                } else if(Integer.parseInt(temp) % 2 == 0) {
                    continue;
                } else {
                    sum += Integer.parseInt(temp);
                }
            }
            System.out.println("#" + i + " " + sum);
        }
    }
}
