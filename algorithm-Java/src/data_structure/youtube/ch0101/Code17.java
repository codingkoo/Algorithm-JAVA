package data_structure.youtube.ch0101;

/*
 * 문제 : 1~100000 사이의 소수를 출력하라(메서드 분할)
 * 작성일 : 20171102
 * 출처 : [Java로 배우는 자료구조] 제1-2장: 메서드와 프로그램의 기능적 분할 (1/4) https://youtu.be/4TXRMyBh-Yc
 * 소감 : i와 n을 적절한 위치에 비교해야 되는데 헷갈려서 결과가 이상하게 나왔었다. 그래도 쉬운편.
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
