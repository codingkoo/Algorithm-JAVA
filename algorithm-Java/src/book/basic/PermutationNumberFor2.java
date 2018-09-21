package book.basic;

public class PermutationNumberFor2 {
    
    // 중복을 허용하는 숫자 순열 연습
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3};
        
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers.length; j++) {
                if(j != i) {
                    for(int k = 0; k < numbers.length; k++) {
                        if(k != i & k != j) {
                            for(int l = 0; l < numbers.length; l++) {
                                if(l != i & l != j 
                                        & l != k) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(numbers[i]);
                                    sb.append(numbers[j]);
                                    sb.append(numbers[k]);
                                    sb.append(numbers[l]);
                                    System.out.println(sb);
                                }
                            }
                        }
                    }
                }
            }            
        }
    }
}
