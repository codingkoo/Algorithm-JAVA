package data_structure.youtube.ch01;
/*
 * 문제 : n개의 정수를 입력 받은 후 오름차순으로 정렬(sort)하여 출력
 * 작성일 : 20171102
 * 출처 : [Java로 배우는 자료구조] 제1-1장: 변수, 배열, 반복문 (7/7) https://youtu.be/-ctZ2enB8WY
 * 소감 : 쉬웠다.
 * */

import java.util.Scanner;

public class Code14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int nums[] = new int[n];

		for (int i = 0; i < n; i++)
			nums[i] = scan.nextInt();

		scan.close();
		for(int j=0; j<n-1; j++){
			for (int i = 0; i < n - 1; i++) {
				int temp;
				if (nums[i] > nums[i + 1]) {
					temp = nums[i + 1];
					nums[i + 1] = nums[i];
					nums[i] = temp;
				}
			}
		}
			

		for (int i = 0; i < n; i++)
			System.out.print(nums[i]);
	}

}
