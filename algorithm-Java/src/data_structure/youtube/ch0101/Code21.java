package data_structure.youtube.ch0101;

/*
 * 문제 : 입력으로 n*n 개의 음이 아닌 한자리 정수가 주어진다. 이 정수들 중 가로, 세로, 대각선의 8방향으로 연속된 숫자들을 이어서
 * 		 만들 수 있는 모든 소수를 찾아서 나열하는 프로그램을 작성하라. 중복된 수를 출력해도 상관없다.
 * 작성일 : 20171104
 * 출처 : [Java로 배우는 자료구조] 제1-2장: 메서드와 프로그램의 기능적 분할 (4/4) https://youtu.be/zPkuOLOXsAc
 * 소감 : 지금까지 배운 것이 총망라된 highlight 문제.
 * */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Code21 {
	
	static int n;
	static int[][] grid;
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(new File("Code21Input.txt"));
			
			n = scan.nextInt();
			grid = new int[n][n];
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) 
					grid[i][j] = scan.nextInt();					
			}
			
			
			scan.close();
			for(int x=0; x<n; x++) {
				for(int y=0; y<n; y++) {
					for(int dir=0; dir < 8; dir++) {
						for(int len=1; len <= n; len++) {
							int value = computeValue(x, y, dir, len);
							if (isPrime(value) && value != -1)
								System.out.println(value);
						}
					}
				}
			}
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public static int computeValue(int x, int y, int dir, int len) {
		int value = 0;
		for(int i=0; i < len; i++) {
			int digit = getDigit(x, y, dir, i);
			if( digit == -1)
				return -1;
			value = value * 10 + digit;
		}
		return value;
	}
	
	public static int getDigit(int x, int y, int dir, int k) {
		int newX = x;
		int newY = y;
		
		switch(dir) {
			case 0 : 			newY -= k; break;
			case 1 : newX += k; newY -= k; break;
			case 2 : newX += k; break;
			case 3 : newX += k; newY += k; break;
			case 4 : 			newY += k; break;
			case 5 : newX -= k; newY += k; break;
			case 6 : newX -= k; break;
			case 7 : newX -= k; newY -= k; break;
		}
		//예외처리
		if(newX == 0 || newX >= n || newY == 0 || newY >= n)
			return -1;
		
		return grid[newX][newY];
	}
	
	static boolean isPrime(int number) {
		boolean judge = true;
		for(int i=2; i*i <= number; i++) {
			if (number % i==0)
				judge = false;
		}
		return judge;
	}
}
