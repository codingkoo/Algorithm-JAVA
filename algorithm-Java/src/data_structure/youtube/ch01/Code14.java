package data_structure.youtube.ch01;
/*
 * ���� : n���� ������ �Է� ���� �� ������������ ����(sort)�Ͽ� ���
 * �ۼ��� : 20171102
 * ��ó : [Java�� ���� �ڷᱸ��] ��1-1��: ����, �迭, �ݺ��� (7/7) https://youtu.be/-ctZ2enB8WY
 * �Ұ� : ������.
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
