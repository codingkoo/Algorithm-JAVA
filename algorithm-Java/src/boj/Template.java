package boj;


import java.io.*; 
import java.util.*; 

public class Template { 
	public static void main(String[] args) throws Exception { 
		InputStream inputStream = System.in; 
		OutputStream outputStream = System.out; 
		InputReader in = new InputReader(inputStream); 
		PrintWriter out = new PrintWriter(outputStream); 

		ALGO solver = new ALGO(); 
		//while (solver.solve(1, in, out)) { 
		int T = in.nextInt(); 
		int next[] = new int[T];
	      StringBuffer sb = new StringBuffer();
		for (int i = 0; i < T; i++) { 
		    next[i] = solver.solve(i + 1, in, out);
		    sb.append(next[i]);
		} 

		out.println(sb);
		out.close(); 
	} 
} 

class ALGO { 
	public int solve(int testNumber, InputReader in, PrintWriter out) { 
		int N = in.nextInt(); 
		//algorithm
		
		return N;
	} 
} 

class InputReader { 
	public BufferedReader reader; 
	public StringTokenizer tokenizer; 

	public InputReader(InputStream stream) { 
		reader = new BufferedReader(new InputStreamReader(stream)); 
		tokenizer = null; 
	} 

	public String next() { 
		while (tokenizer == null || !tokenizer.hasMoreTokens()) { 
			try { 
				tokenizer = new StringTokenizer(reader.readLine()); 
			} catch (IOException e) { 
				throw new RuntimeException(e); 
			} 
		} 
		return tokenizer.nextToken(); 
	} 

	public int nextInt() { 
		return Integer.parseInt(next()); 
	} 

	public long nextLong() { 
		return Long.parseLong(next()); 
	} 

	public double nextDouble() { 
		return Double.parseDouble(next()); 
	} 
}