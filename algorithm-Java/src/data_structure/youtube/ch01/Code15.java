package data_structure.youtube.ch01;
/*
 * 문제 : 우선 n개의 정수를 입력받는다. 정수가 하나씩 입력될 때 마다 현재까지 입력된 정수들을 
 * 		  오름차순으로 정렬하여 출력하라.
 * 작성일 : 20171102
 * 출처 : [Java로 배우는 자료구조] 제1-1장: 변수, 배열, 반복문 (7/7) https://youtu.be/-ctZ2enB8WY
 * 소감 : 4중첩 포문이라 좀 많이 헤맸다. 근데 기본 원리 위에 for문을 차곡 차곡 쌓았다고 생각하면 쉽게 풀 수 있었다.
 * */

import java.util.Scanner;

public class Code15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int nums[] = new int[n];

		for (int i = 0; i < n; i++) {
			nums[i] = scan.nextInt();
			for (int j = 0; j <= i; j++) {
				for (int h = 0; h <= j; h++) {
					for (int k = 1; k <= j; k++) {
						int temp;
						if (nums[k] < nums[k - 1] && j > 0) {
							temp = nums[k];
							nums[k] = nums[k - 1];
							nums[k - 1] = temp;
						}
					}
				}
			}

			for (int g = 0; g <= i; g++)
				System.out.print(nums[g] + " ");
		}
		
		scan.close();
	}
}
