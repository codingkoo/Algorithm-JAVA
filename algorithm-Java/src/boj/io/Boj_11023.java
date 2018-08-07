package boj.io;

import java.io.*;
import java.util.*;


public class Boj_11023 {
	public static void main(String args[]) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line = bf.readLine();
		StringTokenizer st = new StringTokenizer(line, ",");
		int sum = 0;
		while (st.hasMoreTokens()) {
			sum += Integer.valueOf(st.nextToken());
		}
		System.out.println(sum);
	}
}
