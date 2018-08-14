package data_structure.youtube.ch01;
/*
 * ���� : �켱 n���� ������ �Է¹޴´�. ������ �ϳ��� �Էµ� �� ���� ������� �Էµ� �������� 
 * 		  ������������ �����Ͽ� ����϶�.
 * �ۼ��� : 20171102
 * ��ó : [Java�� ���� �ڷᱸ��] ��1-1��: ����, �迭, �ݺ��� (7/7) https://youtu.be/-ctZ2enB8WY
 * �Ұ� : 4��ø �����̶� �� ���� ��̴�. �ٵ� �⺻ ���� ���� for���� ���� ���� �׾Ҵٰ� �����ϸ� ���� Ǯ �� �־���.
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
