package book.basic;

import java.util.Scanner;

public class MaxValue {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		scan.close();
		System.out.println(max4(a,b,c,d));
	}

	public static int max4(int a, int b, int c, int d) {
		int max = a;
		if(b > max) {
			max = b;
		} 
		
		if(c > max) { 
			max = c;
		}
		
		if(d > max) {
			max = d;
		}
		
		return max;
	}
}
