package swea;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SWEA_1208_Flattern {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int T = 10;
        Scanner scan = new Scanner(System.in);
        for(int t = 1; t <= T; t++) {
            int dumpCount = scan.nextInt();
            scan.nextLine();
            String line = scan.nextLine();
            StringTokenizer st = new StringTokenizer(line, " ");
            
            int[] numbers = new int[st.countTokens()];
            int tempi = 0;
            while(st.hasMoreTokens()) {
                numbers[tempi] = Integer.parseInt(st.nextToken());
                tempi++;
            }
            
            for(int i = 0; i < dumpCount; i++) {
                int maxPivot = findMax(numbers);
                int minPivot = findMin(numbers);
                numbers[maxPivot] -= 1;
                numbers[minPivot] += 1;
            }
            
            int result = numbers[findMax(numbers)] - numbers[findMin(numbers)];
            System.out.println("#" + t + " " + result);
        }
        scan.close();
    }
    
    static int findMax(int[] numbers) {
       int max = 0;
       
       for(int i = 1; i < numbers.length; i++) {
           if(numbers[i] > numbers[max]) {
               max = i;
           }
       }
       
       return max;

    }
    
    static int findMin(int[] numbers) {
        int min = 0;
        
        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] < numbers[min]) {
                min = i;
            }
        }
        
        return min;
    }
}
