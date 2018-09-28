package boj;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_1963_prime_number_count {
    
    static boolean[] primeList = new boolean[10000];

    public static void main(String[] args) {
        //소수 리스트 구하기
        for(int i = 1000; i < 10000; i++) {
            if(isPrime(i)) {
                primeList[i] = true;
            }
        }

        Scanner scan = new Scanner(System.in);
        
        int T = scan.nextInt();
        for(int t = 1; t <= T; t++) {
            Queue<Integer> q = new LinkedList<>();
            boolean[] check = new boolean[10000];
            int[] dist = new int[10000];
            int start = scan.nextInt();

            int end = scan.nextInt();
            
            q.add(start);
            dist[start] = 0;
            check[start] = true;
            
            while(!q.isEmpty()) {
                int temp = q.poll();
                if(temp == end) {
                    break;
                }
                bfs(temp, check, dist, q);
            }
            System.out.println(dist[end]);
        }
        scan.close();
    }
    
    public static boolean isPrime(int number) {
        boolean result = true;
        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return result;
    }
    
    public static void bfs(int number, boolean[] check, int[] dist, Queue<Integer> q) {
        int[] parseN = new int[4];
        int tempNum = number;
        int tempi = 0;
        
        //입력받은 number를 자릿수로 전부 쪼개서 parseN에 저장한다.
        while(tempNum > 0) {
            parseN[tempi] = tempNum % 10;
            tempNum = tempNum / 10;
            tempi++;
        }
       //1 자리수의 경우
       for(int i = 0; i <= 9; i++) {
           int calNum = parseN[3] * 1000 + parseN[2] * 100 + parseN[1] * 10 + i;
           if(check[calNum] == false) {
               if(primeList[calNum] == true) {
                   q.add(calNum);
                   check[calNum] = true;
                   dist[calNum] = dist[number] + 1;
               }    
           }
       }
       
      //10 자리수의 경우
      for(int i = 0; i <= 9; i++) {
          int calNum = parseN[3] * 1000 + parseN[2] * 100 + i * 10 + parseN[0];
          if(check[calNum] == false) {
              if(primeList[calNum] == true) {
                  q.add(calNum);
                  check[calNum] = true;
                  dist[calNum] = dist[number] + 1;
              }    
          }
      }
      
      //100 자리수의 경우
      for(int i = 0; i <= 9; i++) {
          int calNum = parseN[3] * 1000 + i * 100 + parseN[1] * 10 + parseN[0];
          if(check[calNum] == false) {
              if(primeList[calNum] == true) {
                  q.add(calNum);
                  check[calNum] = true;
                  dist[calNum] = dist[number] + 1;
              }    
          }
      }
      
      //1000 자리수의 경우
      for(int i = 1; i <= 9; i++) {
          int calNum = i * 1000 + parseN[2] * 100 + parseN[1] * 10 + parseN[0];
          if(check[calNum] == false) {
              if(primeList[calNum] == true) {
                  q.add(calNum);
                  check[calNum] = true;
                  dist[calNum] = dist[number] + 1;
              }    
          }
      }

    }
}
