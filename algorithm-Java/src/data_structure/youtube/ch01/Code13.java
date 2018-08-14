package data_structure.youtube.ch01;
/*
 * 문제 : n개의 음이 아닌 한 자리 정수를 입력받아 배열에 저장한다. 이들 중에서 1개 이상의 연속된 정수들을 합하여(?)
 * 		얻을 수 있는 소수들 중에서 최대값을 구하여 출력하는 프로그램을 작성하라.
 * 작성일 : 20171031
 * 출처 : [Java로 배우는 자료구조] 제1-1장: 변수, 배열, 반복문 (6/7) https://youtu.be/z_9h1-NgSq0
 * 소감 : 이것도 족히 2시간은 고민해서 푼 것 같다. Code 12랑 13은 다시 한 번 처음부터 풀어봐야지.
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
