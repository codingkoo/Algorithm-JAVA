package boj.dp;

import java.util.Scanner;

// 이 풀이는 시간초과
public class Boj_1003_Fibonacci {
	
	public static int calledZero = 0;
	public static int calledOne = 0;
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		
		fiboCal(n);
		System.out.println(calledZero + " " + calledOne);
	}
	
	public static int fiboCal(int n) {
		
		if(n == 0) {
			calledZero = calledZero +1;
			return 0;
		} else if(n==1) {
			calledOne = calledOne + 1;
			return 1;
		} else {
			return fiboCal(n-1) + fiboCal(n-2);
		}
	}
}
