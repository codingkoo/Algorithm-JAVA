package boj.dp;

import java.util.Scanner;

public class Boj_1149_RGB_Street {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int houses = scan.nextInt();
        int[] price = new int[3];
        for(int k:price) {
            price[k] = scan.nextInt();
        }
        scan.close();
        
        
        
    }
    
    public static int fillPrice(int price, int n) {                
        int case1 = 0;
        int case2 = 0;
        int[] calPrice = new int[n];
        int result = 0;
        
        //compare case1 and case2
        if(case1 > case2) {
            result = case1;
        } else {
            result = case2;
        }
        return result;
    }
    
    public static int calPrice(int[] price, int n, int APrice, int BPrice, int CPrice) {
        
        int[] colors = new int[n];
        int result = 0;
        
        int temp1;
        int temp2;
        int temp3;
        
        if(n == 1) {
            result = compareMinPrice(APrice, BPrice, CPrice);
        } else if (n == 2){
            temp1 = compareMinPrice2(APrice, BPrice);
            temp2 = compareMinPrice2(APrice, CPrice);
            temp3 = compareMinPrice2(BPrice, CPrice);
            
            result = compareMinPrice(temp1, temp2, temp3);          
        } else {
            
        }
        
        
        
        return result;
    }

    
    public static int compareMinPrice(int a, int b, int c) {
        int temp = a;
        if(a <= b & a <= c) {
            temp = a;
        } else if(b <= a & b <= c) {
            temp = b;   
        } else if(c <= a & c <= b) {
            temp = c;
        }
        return temp;
    }
    
    public static int compareMinPrice2(int a, int b) {
        int temp = a;
        if(a <= b) {
            temp = a;
        } else {
            temp = b;
        }
        return temp;
    }
    
    
}
