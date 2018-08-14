/*
 * 문제 : n개의 정수를 입력받아 배열에 저장한다. 이들 중에서 0개 이상의 연속된 정수들을 더하여 얻을 수 있는 최대값을
 * 		출력하는 프로그램을 만들어라
 * 작성일 : 20171031
 * 출처 : [Java로 배우는 자료구조] 제1-1장: 변수, 배열, 반복문 (6/7) https://youtu.be/z_9h1-NgSq0
 * 소감 : 3중 포문인데 그것을 몰라 한참을 헤맸다. for문을 3번 중첩되게 쓰면 된다...
 * */
package data_structure.youtube.ch01;

import java.util.Scanner;

public class Code12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int nums[] = new int[n];
		
		for(int i = 0; i < n; i++)
			nums[i] = scan.nextInt();
		
		scan.close();
		
		int max = nums[0];
		for(int i = 0; i <= n-2; i++) {
			for(int j = n-1; j > i; j--) {
				int sum = nums[i];
				for(int k = i+1; k <= j; k++){
					sum += nums[k];
					if(sum > max)
						max = sum;
				}	
			}
		}
		System.out.println(max);
	}
}
