package data_structure.youtube.ch01;

/*
 * 문제 : 1~100000사이의 모든 소수 출력하기
 * 작성일 : 20171030
 * 출처 : [Java로 배우는 자료구조] 제1-1장: 변수, 배열, 반복문 (5/7) https://youtu.be/eQ2i4a3iGcQ
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
