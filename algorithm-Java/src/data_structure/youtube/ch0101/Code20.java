package data_structure.youtube.ch0101;

/*
 * ���� : ���Ϸκ��� ���ڿ��� �Է¹޾� ��ȭ��ȣ�θ� ������������ �����ϱ�
 * �ۼ��� : 20171102
 * ��ó : [Java�� ���� �ڷᱸ��] ��1-2��: �޼���� ���α׷��� ����� ���� (3/4) https://youtu.be/nNWDHy_O6yk
 * �Ұ� : String���� ���� ���Ŀ� ���� �����. ������ �ڵ��� �ϸ� ������ ������ ����. �̻��ϳ�.. �� �������� �ǰ� �� �ȵɱ�?
 *      �׷��� ���� �����ߴ�.
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
				if(names[j].compareTo(names[j+1]) > 0) { // ���ڿ��� ������ �������� ũ�� ������ ���Ҷ��� compareTo�� ����.
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
