package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class swea_5293_digit_recovery {
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        for(int i=0; i < T; i++) { //알고리즘 시작
            String s = bf.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int[] repeat = new int[4];
            for(int j=0; j<4; j++) {
                repeat[j] = Integer.parseInt(st.nextToken(" ")); //repeat[0] = 00, [1] = 01, [2] = 10, [3]=11의 갯수를 의미
            }
            
            if(repeat[1] == 0 & repeat[2] == 0) {
                System.out.println(("#" + (i+1) + " imposible"));
            }
            
            Stack<String> stZero = new Stack<>();
            Stack<String> stOne = new Stack<>();
            
            while(repeat[0] >0) {
                stZero.push("00");
                repeat[0]--;
            }
            
            while(repeat[1]>0) {
                stZero.push("01");
                repeat[1]--;
            }
            
            while(repeat[2]>0) {
                stOne.push("10");
                repeat[2]--;
            }
            
            while(repeat[3]>0) {
                stOne.push("11");
                repeat[3]--;
            }
   
        }
    }    
}

