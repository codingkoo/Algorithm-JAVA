package data_structure.youtube.ch0101;

/*
 * 문제 : n개의 정수를 입력받아 오름차순으로 출력하라(메서드 분할)
 * 작성일 : 20171102
 * 출처 : [Java로 배우는 자료구조] 제1-2장: 메서드와 프로그램의 기능적 분할 (2/4) https://youtu.be/DQfI1BvkfMs
 * 소감 : 버블 소트는 3중 for문으로 구현하는 방법이 있고, 첫번재 for문을 -시켜서 2중으로 구현하는 방법도 있다.
 *       값에 의한 호출 개념은 중요하다. 알아두자.
 * */

import java.util.Scanner;

public class Code18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int[] nums = new int[n];
		
		for(int i=0; i < n; i++)
			nums[i] = scan.nextInt();
		
		scan.close();
		bubbleSort(nums, n);
		for(int g=0; g < n; g++)
			System.out.print(nums[g]);
			System.out.println("");
	}
	
	static int[] bubbleSort(int[] a, int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				for(int k=0; k<i; k++) {
					int temp;
					if(a[k]>a[k+1]) {
						 temp = a[k+1];
						a[k+1] = a[k];
						a[k] = temp;
					}
				}
			}
		}
		return a;
	}
}
