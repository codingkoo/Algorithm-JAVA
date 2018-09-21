package book.basic;

import java.util.LinkedList;

public class PermutationFor {
    
    // Using 1, 2, 3, 4
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        
        for(int i = 0; i < numbers.size(); i++) {
            for(int j = 0; j < numbers.size(); j++) {
                if(numbers.get(j) != numbers.get(i)) {
                    for(int k = 0; k < numbers.size(); k++) {
                        if(numbers.get(k) != numbers.get(i) & numbers.get(k) != numbers.get(j)) {
                            for(int l = 0; l < numbers.size(); l++) {
                                if(numbers.get(l) != numbers.get(i) & numbers.get(l) != numbers.get(j) 
                                        & numbers.get(l) != numbers.get(k)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(numbers.get(i));
                                    sb.append(numbers.get(j));
                                    sb.append(numbers.get(k));
                                    sb.append(numbers.get(l));
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
