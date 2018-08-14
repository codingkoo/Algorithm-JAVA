/*
 * ���� : n���� ������ �Է¹޾� �迭�� �����Ѵ�. �̵� �߿��� 0�� �̻��� ���ӵ� �������� ���Ͽ� ���� �� �ִ� �ִ밪��
 * 		����ϴ� ���α׷��� ������
 * �ۼ��� : 20171031
 * ��ó : [Java�� ���� �ڷᱸ��] ��1-1��: ����, �迭, �ݺ��� (6/7) https://youtu.be/z_9h1-NgSq0
 * �Ұ� : 3�� �����ε� �װ��� ���� ������ ��̴�. for���� 3�� ��ø�ǰ� ���� �ȴ�...
 * */
package data_structure.youtube.ch01;

import java.util.Scanner;

public class Code12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int nums[] = new int[n];
		
		for(int i = 0; i < n; i++)
			nums[i] = scan.nextInt();
		
		scan.close();
		
		int max = nums[0];
		for(int i = 0; i <= n-2; i++) {
			for(int j = n-1; j > i; j--) {
				int sum = nums[i];
				for(int k = i+1; k <= j; k++){
					sum += nums[k];
					if(sum > max)
						max = sum;
				}	
			}
		}
		System.out.println(max);
	}
}
