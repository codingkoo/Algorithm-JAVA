package boj.io;

import java.util.Scanner;

public class Boj_2741 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=n; i++) {
			sb.append(i + "\n");
		}
		//println이 아닌 print인 것에 유의하자
		System.out.print(sb);
	}
}
