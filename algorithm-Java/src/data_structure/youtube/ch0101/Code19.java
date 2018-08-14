package data_structure.youtube.ch0101;

/*
 * ���� : ���Ϸκ��� ���ڿ��� �Է¹޾� ��ȭ��ȣ�θ� �迭�� �����ϱ�
 * �ۼ��� : 20171102
 * ��ó : [Java�� ���� �ڷᱸ��] ��1-2��: �޼���� ���α׷��� ����� ���� (3/4) https://youtu.be/nNWDHy_O6yk
 * �Ұ� : �ý��ۿ� �ִ� �ؽ�Ʈ ������ �д� ���� ���� �����.
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
