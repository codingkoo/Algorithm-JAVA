package data_structure.youtube.ch0101;

/*
 * 문제 : 두 정수 a와 b를 받아, a의 b승을 계산하라.
 * 작성일 : 20171102
 * 출처 : [Java로 배우는 자료구조] 제1-2장: 메서드와 프로그램의 기능적 분할 (1/4) https://youtu.be/4TXRMyBh-Yc
 * 소감 : 처음에는 a에 a를 곱하게 만들어서 값이 곱절로 커졌다. lastNum 같은 임의의 변수가 필요하다.
 * */

import java.util.Scanner;

public class Code16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		
		scan.close();
		
		System.out.print(square(a, b));
	}
	
	static int square(int a, int b) {
		int lastNum;
		
		if(b==0)
			lastNum = 1;
		else
			lastNum = a;
		
		for(int i=1; i < b; i++) {
			lastNum = lastNum * a;
		}
		return lastNum;
	}
}
