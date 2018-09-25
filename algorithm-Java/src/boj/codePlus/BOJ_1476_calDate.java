package boj.codePlus;

import java.util.Scanner;

public class BOJ_1476_calDate {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int E = scan.nextInt();
       int S = scan.nextInt();
       int M = scan.nextInt();
       
       scan.close();
       

       int e = 1;
       int s = 1;
       int m = 1;
       
       for(int i = 1; i < 1000000; i++) {
           if(e == E & s == S & m == M) {
               System.out.println(i);
               break;
           }
           
           e += 1;
           s += 1;
           m += 1;
           
           if(e == 16)
               e =1;
           
           if(s == 29)
               s = 1;
           
           if(m == 20)
               m = 1;
               
           
       }
    }   
}
