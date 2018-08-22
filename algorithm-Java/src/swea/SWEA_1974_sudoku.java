package swea;

import java.util.Scanner;

public class SWEA_1974_sudoku {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int i = 1; i <= T; i++) {
            int[][] map = new int[9][9];
            for(int y = 0; y < 9; y++) {
                for(int x = 0; x < 9; x++) {
                    map[y][x] = scan.nextInt();
                }
            }
            
            int correct = 1;
            
            for(int y = 0; y < 9; y++) {
                for(int x = 0; x < 9; x++) {
                    //가로세로줄 체크
                    int sumVert = 0;
                    int sumHori = 0;
                    for(int j = 0; j <9; j++) {
                        sumVert += map[j][x];
                        sumHori += map[y][j];
                    }

                    if(sumVert !=45 | sumHori !=45) {
                        correct = 0;
                        break;
                    }
                    
                    //그리드체크

                }
            }
            System.out.println("#" + i + " " + correct);
        }
    }
}
