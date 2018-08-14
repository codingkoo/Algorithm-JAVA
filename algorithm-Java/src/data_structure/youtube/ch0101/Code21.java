package data_structure.youtube.ch0101;

/*
 * ���� : �Է����� n*n ���� ���� �ƴ� ���ڸ� ������ �־�����. �� ������ �� ����, ����, �밢���� 8�������� ���ӵ� ���ڵ��� �̾
 * 		 ���� �� �ִ� ��� �Ҽ��� ã�Ƽ� �����ϴ� ���α׷��� �ۼ��϶�. �ߺ��� ���� ����ص� �������.
 * �ۼ��� : 20171104
 * ��ó : [Java�� ���� �ڷᱸ��] ��1-2��: �޼���� ���α׷��� ����� ���� (4/4) https://youtu.be/zPkuOLOXsAc
 * �Ұ� : ���ݱ��� ��� ���� �Ѹ���� highlight ����.
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
		//����ó��
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
