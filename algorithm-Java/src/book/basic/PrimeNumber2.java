package book.basic;

public class PrimeNumber2 {
    public static void main(String args[]) {
        int max = 103;
        //찾은 소수의 개수
        int ptr = 0;
        //max/2개를 생성해도 됨
        int[] pNums = new int[max];
        pNums[ptr++] = 2;
		
        for(int n=3; n <= max; n+= 2) {
            for(int i=0; i < ptr; i ++) {
                if(n % pNums[i] == 0) {
                    break;
                }
                if(ptr == i+1) {
                    pNums[ptr++] = n;
                }
            }
        }
        
        for (int i = 0; i < ptr; i++) {
            System.out.println(pNums[i]);
        }
    }
}
