package data_structure.youtube.ch0101;

/*
 * ���� : n���� ������ �Է¹޾� ������������ ����϶�(�޼��� ����)
 * �ۼ��� : 20171102
 * ��ó : [Java�� ���� �ڷᱸ��] ��1-2��: �޼���� ���α׷��� ����� ���� (2/4) https://youtu.be/DQfI1BvkfMs
 * �Ұ� : ���� ��Ʈ�� 3�� for������ �����ϴ� ����� �ְ�, ù���� for���� -���Ѽ� 2������ �����ϴ� ����� �ִ�.
 *       ���� ���� ȣ�� ������ �߿��ϴ�. �˾Ƶ���.
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
