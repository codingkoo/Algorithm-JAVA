package data_structure.youtube.ch0101;

/*
 * 문제 : 파일로부터 문자열을 입력받아 전화번호부를 배열에 저장하기
 * 작성일 : 20171102
 * 출처 : [Java로 배우는 자료구조] 제1-2장: 메서드와 프로그램의 기능적 분할 (3/4) https://youtu.be/nNWDHy_O6yk
 * 소감 : 시스템에 있는 텍스트 파일을 읽는 법을 드디어 배웠다.
 * */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code19 {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(new File("Code19input.txt"));
			int n = 1000;
			String[] name = new String[n];
			String[] mobile = new String[n];

			int count = 0;
			while (scan.hasNext()) {
				name[count] = scan.next();
				mobile[count] = scan.next();
				count++;
			}

			scan.close();

			for (int i = 0; i < count; i++) {
				System.out.println("name: " + name[i] + ", mobile: " + mobile[i]);
			}

		} catch (FileNotFoundException e) {
			System.out.println("No file");
			e.printStackTrace();
			System.exit(1);
		}
	}
}
