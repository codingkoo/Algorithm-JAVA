package quiz.kakao;

import java.util.Scanner;

//ù��° Ǯ�� �ҿ�ð� : 1�ð� 46��
public class Maze {
	public static int n;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		//���ڸ� �Է¹޾� �迭�� ����
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr1[i] = scan.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			arr2[i] = scan.nextInt();
		}
		
		scan.close();
		
		//2���� ���� ����
		char[][] map1 = new char[n][n];
		char[][] map2 = new char[n][n];
		char[][] resultMap = new char[n][n];
		
		//2���� ������ �ڷ� �Է�
		for(int i = 0; i < n; i++) {
			for(int j=0; j<n; j++) {
				map1[i][j] = byteCalc(arr1[i]).charAt(j);
				map1[i][j] = charConv(map1[i][j]);
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j=0; j<n; j++) {
				map2[i][j] = byteCalc(arr2[i]).charAt(j);
				map2[i][j] = charConv(map2[i][j]);
			}
		}
		
		StringBuffer sb = new StringBuffer();
		
		//2���� ������ ���ؼ� ���� ������� ����
		for(int i = 0; i < n; i++) {
			for(int j =0; j <n; j++) {
				if(map1[i][j] == '#' || map2[i][j] == '#') {
					resultMap[i][j] = '#';
					sb.append(resultMap[i][j]);
				} else {
					resultMap[i][j] = ' ';
					sb.append(resultMap[i][j]);
				}
			}
			sb.append(",");
		}
		//�������� �ٴ� ","�� ����
		sb.deleteCharAt(sb.length()-1);
		
		//��� �迭 �����
		String result = "[";
		result = result + sb.toString();
		result = result + "]";
		System.out.println(result);
		
	}
	
	public static String byteCalc(int k) {
		int temp = k;
		StringBuffer sb = new StringBuffer();
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = temp % 2;
			temp = temp / 2;
			sb.append(result[i]);
		}
		sb = sb.reverse();
		String resultSet = sb.toString();
		return resultSet;
	}
	
	public static char charConv(char k) {
		char result = ' ';
		if(k == '0') {
			result = ' ';
		} else if(k == '1') {
			result = '#';
		} else {
			System.out.println("���� �߸��ƽ��ϴ�.");
			
		}
		return result;
	}
}
