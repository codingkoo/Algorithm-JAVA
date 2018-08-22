package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_1284_bill{
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=1; i <= T; i++) {
            String s = br.readLine();
            StringTokenizer st= new StringTokenizer(s, " ");
            int aPrice = Integer.parseInt(st.nextToken());
            int bPriceBase = Integer.parseInt(st.nextToken());
            int bPriceLimit = Integer.parseInt(st.nextToken());
            int bPriceAdd = Integer.parseInt(st.nextToken());
            int bPriceTotal = 0;
            int used = Integer.parseInt(st.nextToken());
            int nicePrice = 0;
            
            aPrice = aPrice * used;
            
            if(used <= bPriceLimit) {
                bPriceTotal = bPriceBase;
            } else {
                bPriceTotal = bPriceBase + (used - bPriceLimit) * bPriceAdd; 
            }
            
            if(aPrice < bPriceTotal) {
                nicePrice = aPrice;
            } else {
                nicePrice = bPriceTotal;
            }
            System.out.println("#" + i + " " + nicePrice);
        }
    }
}
