package book.basic;

import java.util.Scanner;

public class Sum1 {
	
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
