package swea;

import java.util.Scanner;

public class SWEA_1213_String {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for(int t = 1; t <= 10; t++) {
            //입력에서 주어지는 테스트 케이스 번호는 필요 없으므로, 한 번 읽어서 포인터를 옮기기만 한다.
            scan.nextLine();
            String toFind = scan.nextLine();
            String line = scan.nextLine();
            
            int count = 0;
            for(int i = 0; i <= line.length()-toFind.length(); i++) {
                String temp = line.substring(i, i+toFind.length());
                if(temp.equals(toFind))
                    count+=1;
            }
            
            System.out.println("#" + t + " " + count);
            
        }
        scan.close();
        
    }

}
