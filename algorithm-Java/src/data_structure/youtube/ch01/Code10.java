package data_structure.youtube.ch01;

/*
 * ���� : 1~100000������ ��� �Ҽ� ����ϱ�
 * �ۼ��� : 20171030
 * ��ó : [Java�� ���� �ڷᱸ��] ��1-1��: ����, �迭, �ݺ��� (5/7) https://youtu.be/eQ2i4a3iGcQ
 * */

public class Code10 {
	public static void main(String[] args) {
		int n = 100000;
		for(int i = 2; i <= n; i++) {
			boolean isPrime = true;
			for(int j = 2; j*j <= i && isPrime; j++)
				if( i % j == 0 )
					isPrime = false;
			
			if(isPrime)
				System.out.println(i);
		}
	}
}
