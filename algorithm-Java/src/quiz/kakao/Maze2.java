package quiz.kakao;

import java.util.ArrayList;
import java.util.Scanner;

public class Maze2 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		Integer[] arr1 = new Integer[n];
		Integer[] arr2 = new Integer[n];
		
		for(int i = 0; i < n; i++) {
			arr1[i] = scan.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			arr2[i] = scan.nextInt();
		}
		
		scan.close();
		
		String[] result1 = new String[n];
		String[] result2 = new String[n];
		
		for(int i = 0; i < n; i++) {
			result1[i] = Integer.toBinaryString(arr1[i]).replace('0', ' ').replace('1', '#');
			result2[i] = Integer.toBinaryString(arr2[i]).replace('0', ' ').replace('1', '#');
			
			if(result1[i].length() < n) {
				int temp = n - result1[i].length();
				for(int k=0; k < temp; k++) {
					result1[i] = "0" + result1[i];
				}
			}
			
			if(result2[i].length() < n) {
				int temp = n - result2[i].length();
				for(int k=0; k < temp; k++) {
					result2[i] = "0" + result2[i];
				}
			}
		}
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i < n; i++) {
			for(int j=0; j < n; j++) {
				if(result1[i].charAt(j)=='#' || result2[i].charAt(j) =='#') {
					sb.append('#');
				} else {
					sb.append(' ');
				}
			}
			sb.append(',');
		}
		
		sb.deleteCharAt(sb.length()-1);
		String result = "[";
		result = result + sb.toString();
		result = result + "]";
		System.out.println(result);
		
	}
}
