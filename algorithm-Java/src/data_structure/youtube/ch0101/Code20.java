package data_structure.youtube.ch0101;

/*
 * 문제 : 파일로부터 문자열을 입력받아 전화번호부를 오름차순으로 정렬하기
 * 작성일 : 20171102
 * 출처 : [Java로 배우는 자료구조] 제1-2장: 메서드와 프로그램의 기능적 분할 (3/4) https://youtu.be/nNWDHy_O6yk
 * 소감 : String간의 순서 정렬에 대해 배웠다. 교수님 코드대로 하면 오히려 오류가 난다. 이상하네.. 왜 교수님은 되고 난 안될까?
 *      그래서 직접 수정했다.
 * */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code20 {
	
	static int n = 100;
	static int count = 0;
	static String[] names = new String[n];
	static String[] mobiles = new String[n];
	
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(new File("Code19input.txt"));
			
			while(scan.hasNext()) {
				names[count] = scan.next();
				mobiles[count] = scan.next();
				count++;
			}
			scan.close();
			
			bubbleSort();
			
			for(int i=0; i < count; i++)
				System.out.println("names : " + names[i] + ", mobiles : " + mobiles[i]);			
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}
	}
	
	static void bubbleSort() {
		for(int i=count; i>0; i--) {
			for(int j=0; j<count-1; j++) {
				if(names[j].compareTo(names[j+1]) > 0) { // 문자열의 사전식 순서에서 크고 작음을 비교할때는 compareTo를 쓴다.
					String temp;
					temp = names[j];
					names[j] = names[j+1];
					names[j+1] = temp;
					
					temp = mobiles[j];
					mobiles[j] = mobiles[j+1];
					mobiles[j+1] = temp;
				}
			}
		}
	}
}
