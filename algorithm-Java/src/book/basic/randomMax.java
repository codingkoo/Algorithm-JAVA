package book.basic;

import java.util.Random;
import java.util.Scanner;

public class randomMax {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		scan.close();
		
		int a[] = new int[n];
		Random rand = new Random();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i ++) {
			a[i] = rand.nextInt(90);
			sb.append(a[i] + ",");
		}
		int max = maxOf(a);
		System.out.println(sb);
		System.out.println(max);
		
	}
	
	public static int maxOf(int[] a) {
		int max = a[0];
		int i = 0;
		while(i < a.length) {
			if(a[i]>max) {
				max = a[i];
			}
			i++;
		};
		return max;
	}	
}
