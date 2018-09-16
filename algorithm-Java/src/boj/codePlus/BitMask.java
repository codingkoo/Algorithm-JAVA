package boj.codePlus;

import java.util.Scanner;

public class BitMask {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bitmask = 0;
        int TestCase = scan.nextInt();
        for(int i = 0; i < TestCase; i++) {
            String command = scan.next();
            if(command.equals("add")) {
                int number = scan.nextInt();
                bitmask = (bitmask | (1 << number));
            }else if(command.equals("remove")) {
                int number = scan.nextInt();
                bitmask = (bitmask & ~(1 << number));
            }else if(command.equals("check")) {
                int number = scan.nextInt();
                int res = (bitmask & (1 << number));
                if(res != 0)
                    System.out.println(1);
                else
                    System.out.println(0);
            } else if(command.equals("toggle")) {
                int number = scan.nextInt();
                bitmask = (bitmask ^ (1<<number));
            } else if(command.equals("all")) {
                bitmask = (1<<20) -1;
            } else if(command.equals("empty")){
                bitmask = 0;
            }
        }
        scan.close();

    }

}
