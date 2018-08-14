package data_structure.youtube.ch0101;

/*
 * ���� : �� ���� a�� b�� �޾�, a�� b���� ����϶�.
 * �ۼ��� : 20171102
 * ��ó : [Java�� ���� �ڷᱸ��] ��1-2��: �޼���� ���α׷��� ����� ���� (1/4) https://youtu.be/4TXRMyBh-Yc
 * �Ұ� : ó������ a�� a�� ���ϰ� ���� ���� ������ Ŀ����. lastNum ���� ������ ������ �ʿ��ϴ�.
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
