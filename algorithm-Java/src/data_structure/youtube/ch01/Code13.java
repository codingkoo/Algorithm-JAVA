package data_structure.youtube.ch01;
/*
 * ���� : n���� ���� �ƴ� �� �ڸ� ������ �Է¹޾� �迭�� �����Ѵ�. �̵� �߿��� 1�� �̻��� ���ӵ� �������� ���Ͽ�(?)
 * 		���� �� �ִ� �Ҽ��� �߿��� �ִ밪�� ���Ͽ� ����ϴ� ���α׷��� �ۼ��϶�.
 * �ۼ��� : 20171031
 * ��ó : [Java�� ���� �ڷᱸ��] ��1-1��: ����, �迭, �ݺ��� (6/7) https://youtu.be/z_9h1-NgSq0
 * �Ұ� : �̰͵� ���� 2�ð��� ����ؼ� Ǭ �� ����. Code 12�� 13�� �ٽ� �� �� ó������ Ǯ�������.
 * */
import java.util.Scanner;

public class Code13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int nums[] = new int[n];
		
		for(int i = 0; i < n; i++) 
			nums[i] = scan.nextInt();
		
		scan.close();
		
		int max = nums[0];
		
		for(int i=0; i < n; i++) {
			for(int j=n-1; j >= i; j--){
				int resultNum = 0;
				for(int k=i; k <= j; k++){
					resultNum *= 10;
					resultNum += nums[k];
					if(isPrime(resultNum)&&resultNum>max)
						max=resultNum;
				}
			}
			
		}
		System.out.println(max);
	
	}
	
	static Boolean isPrime(int number){
		Boolean prime = true;
		for(int i = 2; i*i <= number&&prime; i++)
			if(number % i == 0)
				prime = false;
		return prime;
	}
}
