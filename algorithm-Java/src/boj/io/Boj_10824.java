package boj.io;

import java.io.*;

public class Boj_10824 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//입력값을 공백(spacebar)으로 구분하여, line[]이라는 배열에 각각 집어넣는다.
		String[] line = bf.readLine().split(" ");
		String a = line[0] + line[1];
		String b = line[2] + line[3];
		long ans = Long.valueOf(a) + Long.valueOf(b);
		System.out.println(ans);
	}
}
