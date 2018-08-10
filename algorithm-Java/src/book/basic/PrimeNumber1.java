package book.basic;

public class PrimeNumber1 {
	public static void main(String args[]) {
		int max = 103;
		for(int i = 2; i <= max; i++) {
			for(int n = 2; n < i; n++) {
				
				if(i%n == 0) {
					break;
				}
				
				if(i == n+1) {
					System.out.println(i);
				}
			}
		}
	}
}
