package quiz.kakao;

import java.util.Scanner;

//첫번째 풀이 소요시간 : 1시간 46분
public class Maze {
	public static int n;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		//숫자를 입력받아 배열로 만듬
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr1[i] = scan.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			arr2[i] = scan.nextInt();
		}
		
		scan.close();
		
		//2차원 지도 생성
		char[][] map1 = new char[n][n];
		char[][] map2 = new char[n][n];
		char[][] resultMap = new char[n][n];
		
		//2차원 지도에 자료 입력
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
		
		//2개의 지도를 비교해서 최종 비밀지도 생성
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
		//마지막에 붙는 ","를 삭제
		sb.deleteCharAt(sb.length()-1);
		
		//결과 배열 만들기
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
			System.out.println("값이 잘못됐습니다.");
			
		}
		return result;
	}
}
