package swea;

import java.util.Base64;
import java.util.Scanner;

public class swea_1928_base64_decoder {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine();
        for(int i = 1; i <= T; i++) {
            String s = scan.nextLine();
            
            byte[] decode = Base64.getDecoder().decode(s);
            String output = new String(decode);
            System.out.println("#" + i + " " + output);    
        }
        
        scan.close();
    }
}
