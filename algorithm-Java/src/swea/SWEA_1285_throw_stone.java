package swea;

import java.util.Scanner;

public class SWEA_1285_throw_stone {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int i = 1; i<=T; i++) {
            int player = scan.nextInt();
            int scores[] = new int[player];
            
            for(int j = 0; j < player; j++) {
                scores[j] = scan.nextInt();
            }
            
            int bestScore = Math.abs(scores[0]);
            int bestPlayer = 0;
            
            for(int k = 0; k < player; k++) {
                if(Math.abs(scores[k]) == bestScore) {
                    bestPlayer++;
                } else if(Math.abs(scores[k]) < bestScore) {
                    bestScore = Math.abs(scores[k]);
                    bestPlayer = 1;
                }
            }
            System.out.println("#" + i + " " + bestScore + " " + bestPlayer);
        }
        scan.close();
    }
}