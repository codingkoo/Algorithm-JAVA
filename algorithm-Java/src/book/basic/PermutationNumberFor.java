package book.basic;

import java.util.LinkedList;

public class PermutationNumberFor {
    
    // Using 1, 2, 3, 4
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4 };
        
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers.length; j++) {
                if(numbers[j] != numbers[i]) {
                    for(int k = 0; k < numbers.length; k++) {
                        if(numbers[k] != numbers[i] & numbers[k] != numbers[j]) {
                            for(int l = 0; l < numbers.length; l++) {
                                if(numbers[l] != numbers[i] & numbers[l] != numbers[j] 
                                        & numbers[l] != numbers[k]) {
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
