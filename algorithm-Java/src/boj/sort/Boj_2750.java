package boj.sort;

import java.util.*;

public class Boj_2750 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
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
	//문제에서 의도한 바는 오름차순 정렬을 직접 구현해서 문제를 풀기를 원했겠지만
	//그냥 JAVA에서 제공하는 sort함수로 간단하게 처리해버림
}
