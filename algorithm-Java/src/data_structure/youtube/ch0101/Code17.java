package data_structure.youtube.ch0101;

/*
 * ���� : 1~100000 ������ �Ҽ��� ����϶�(�޼��� ����)
 * �ۼ��� : 20171102
 * ��ó : [Java�� ���� �ڷᱸ��] ��1-2��: �޼���� ���α׷��� ����� ���� (1/4) https://youtu.be/4TXRMyBh-Yc
 * �Ұ� : i�� n�� ������ ��ġ�� ���ؾ� �Ǵµ� �򰥷��� ����� �̻��ϰ� ���Ծ���. �׷��� ������.
 * */

public class Code17 {
	public static void main(String[] args) {
		int n = 100000;
		for (int i = 2; i <= n; i++) {
			if (isPrime(i))
				System.out.println(i);
		}
	}

	static boolean isPrime(int n) {
		boolean isPrime = true;
		for (int i = 2; i * i <= n && isPrime; i++) {
			if (n % i == 0)
				isPrime = false;
		}
		return isPrime;
	}
}
