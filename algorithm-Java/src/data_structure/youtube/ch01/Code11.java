/*
 * 문제 : 사용자로부터 정수 n을 입력 받는다. 이어서 n개의 정수를 입력받아 순서대로 배열에 저장한다. 그
 *       그런 다음 중복된 쌍의 개수를 카운트하여 출력하라. 예를 들어,
 *       n=6이고 입력된 정수들이 2, 4, 2, 4, 5, 2이면 중복된 정수쌍은 (2,2), (2,2), (2,2), (4,4)로 모두 4쌍이다.
 * 작성일 : 20171030
 * 출처 : [Java로 배우는 자료구조] 제1-1장: 변수, 배열, 반복문 (5/7) https://youtu.be/eQ2i4a3iGcQ
 * */
package data_structure.youtube.ch01;

import java.util.Scanner;

public class Code11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int nums[] = new int[n];
		
		for(int i = 0; i < n; i++)
			nums[i] = scan.nextInt();
		
		scan.close();
		
		int count = 0;
		for(int i=0; i < n-1; i++) {
			for(int j=i+1; j < n; j++) {
				if(nums[i] == nums[j])
					count += 1;
			}
		}
		System.out.print(count);
	}
}
