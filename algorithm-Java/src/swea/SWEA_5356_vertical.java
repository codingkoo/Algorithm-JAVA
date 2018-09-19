package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_5356_vertical {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        
        for(int t = 1; t <= T; t++) {
            String[] vertical = new String[15];
            String[] lines = new String[5];
            for(int i = 0; i < 5; i++) {
                lines[i] = bf.readLine();
                for(int j = 0; j < lines[i].length(); j++) {
                    String temp = lines[i].substring(j, j+1);
                    if(vertical[j] == null) {
                        vertical[j] = temp;
                    } else {
                        vertical[j] += temp;    
                    }
                }
            }
            
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < 15; i++) {
                if(vertical[i] != null) sb.append(vertical[i]);
            }
            System.out.println("#" + t + " " + sb);
        }
    }
}
