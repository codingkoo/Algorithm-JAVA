package boj.sort;

import java.util.*;

public class Boj_2750 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		sc.close();
		int n = sc.nextInt();
		
		int numbers[] = new int[n];
		for(int i=0; i<n; i++) {
			numbers[i] = sc.nextInt();
		}
		
		Arrays.sort(numbers);
		StringBuilder sb = new StringBuilder();
		int i = 0;
		while(i < numbers.length) {
			sb.append(numbers[i] + "\n");
			i++;
		}
		System.out.print(sb);
		
	}
}
