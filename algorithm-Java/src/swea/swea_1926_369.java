package swea;

import java.util.Scanner;

public class swea_1926_369 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++) {
            String number = Integer.toString(i);
            if(number.contains("3") | number.contains("6") | number.contains("9")) {
                String[] numParsed = new String[number.length()];
                for(int j = 0; j < number.length(); j++) {
                    numParsed[j] = number.substring(j, j+1);
                    if(numParsed[j].equals("3")| numParsed[j].equals("6") | numParsed[j].equals("9")) {
                        sb.append("-");
                    }
                }
                sb.append(" ");
            }else {
                sb.append(i + " ");    
            }
                
        }
        System.out.println(sb.toString());
        
    }
}
