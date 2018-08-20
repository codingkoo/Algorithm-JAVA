package quiz.kakao;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class cache {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner scan = new Scanner(System.in);
        int cacheSize = scan.nextInt();
        //nextInt후에 다음 라인을 읽으려면, scan.nextLine()으로 커서를 다음 줄로 올겨야 한다.
        scan.nextLine();
        String input = scan.nextLine(); //도시들 입력받기
        scan.close();
        
        //입력받은 도시들을 규칙대로 잘라 cities[] 배열에 채워 넣는 코드들  
        StringTokenizer st = new StringTokenizer(input, ", ");
        String[] cities = new String[st.countTokens()];
        
        int tempI = 0;
        while(st.hasMoreTokens()) {
            String temp = st.nextToken();
            temp = temp.substring(1, temp.length()-1); //양 옆의 ""를 자르고
            temp = temp.toLowerCase(); //자른 문자열을 소문자로 바꿔준다.
            cities[tempI] = temp;
            tempI++;
        }
        
        //LRU캐시 생성
        LRUCache cache = new LRUCache(cacheSize);
        int time = 0;
        
        //캐시 사이즈가 0일때, hit은 발생하지 않으므로 시간은 무조건 5초씩 증가한다
        if(cacheSize == 0) {
            for(int i =0; i < cities.length; i++) {
                time +=5;
            }
        //캐시 사이즈가 0이 아닌, 일반적인 경우에는 다음과 같다.
        } else {
            for(int i = 0; i < cities.length; i++) {
                String result = cache.set(cities[i]);
                if(result.equals("hit")) {
                    time += 1; 
                } else {
                    time += 5;
                }
            }    
        }
        System.out.println(time);
    }
    
    public static class LRUCache {
        
        //초기화
        int capacity;
        LinkedList<String> cityCached = new LinkedList<String>();
        public LRUCache(int capacity) {
            this.capacity = capacity;
        }
        
        public String set(String city) {
            //캐시 안에 찾는 도시가 있을때
            if(cityCached.contains(city)) {
                cityCached.remove(city);
                cityCached.addFirst(city);
                return "hit";
            }else {
                // 캐시 안에 찾는 도시가 없지만, 캐시가 여유 있을 때
                if(cityCached.size() <= capacity) {
                    cityCached.addFirst(city);
                    return "missed";
                    // 캐시 안에 찾는 도시가 없고, 캐시도 꽉 찼을 때
                } else {
                    cityCached.removeLast();
                    cityCached.addFirst(city);
                    return "missed";
                }
            }
        }
    }   
}
