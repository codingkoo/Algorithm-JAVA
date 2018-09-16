package swea;

import java.util.Scanner;

public class SWEA_2007_Pattern_length {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int i = 1; i <= T; i++) {
            String S = scan.next();
            for(int j = 1; j <= 10; j++) {
                String temp = S.substring(0, j);
                String temp2 = S.substring(j, j+temp.length());
                if(temp.equals(temp2)) {
                    System.out.println("#" + i + " " + temp.length());                    
                    break;
                }
            }
        }
    }
}
