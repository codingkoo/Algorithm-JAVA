/*
 * ���� : ����ڷκ��� ���� n�� �Է� �޴´�. �̾ n���� ������ �Է¹޾� ������� �迭�� �����Ѵ�. ��
 *       �׷� ���� �ߺ��� ���� ������ ī��Ʈ�Ͽ� ����϶�. ���� ���,
 *       n=6�̰� �Էµ� �������� 2, 4, 2, 4, 5, 2�̸� �ߺ��� �������� (2,2), (2,2), (2,2), (4,4)�� ��� 4���̴�.
 * �ۼ��� : 20171030
 * ��ó : [Java�� ���� �ڷᱸ��] ��1-1��: ����, �迭, �ݺ��� (5/7) https://youtu.be/eQ2i4a3iGcQ
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
