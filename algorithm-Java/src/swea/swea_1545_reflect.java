package swea;

import java.util.Scanner;

public class swea_1545_reflect {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i <= N; i++) {
            sb.append(N-i + " ");
        }
        System.out.println(sb.toString());

    }

}
