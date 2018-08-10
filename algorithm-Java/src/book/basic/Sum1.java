package book.basic;

import java.util.Scanner;

public class Sum1 {
	
	// n을 입력하면 1부터 n까지 더하는 식을 출력하고, sum을 출력하기.
	// 예) n이 9일 때, 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = 45
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		
		int sum = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= n-1; i++) {
			sb.append(i + " + ");
			sum = sum + i;
		}
		sb.append(n);
		sum = sum + n;
		
		System.out.println(sb + " = " + sum);
	}
}
