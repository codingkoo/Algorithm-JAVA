package boj.dp;

import java.util.Scanner;

public class Boj_1003_Fibonacci2 {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		//입력받을 정수의 갯수
		int t = scan.nextInt();
		
		//TestCase List
		int[] tList = new int[t];
		for(int i = 0; i < t; i++) {
			tList[i] = scan.nextInt();
		}
		scan.close();
		
	    //문제에서 숫자 N은 40과 같거나 작다는 조건을 주었음
		int[][] nums = new int[41][2];
		
	    //f(0), f(1), f(2)의 값은 규칙성이 없다. 따라서 수동으로 값을 지정
		nums[0][0] = 1;
		nums[0][1] = 0;
		
		nums[1][0] = 0;
		nums[1][1] = 1;
		
		nums[2][0] = 1;
		nums[2][1] = 1;
		
		for(int i = 0; i < t; i++) {
			int temp = tList[i];
			if(temp == 0 | temp == 1 | temp == 2) {
				System.out.println(nums[temp][0] + " " + nums[temp][1] );
			} else {
				for(int k = 3; k < temp+1; k++) {
					nums[k][0] = 2 * nums[k-2][0] + nums[k-3][0];
					nums[k][1] = 2 * nums[k-2][1] + nums[k-3][1];
				}
				System.out.println(nums[temp][0] + " " + nums[temp][1]);
			}
				
		}	
	}
}
