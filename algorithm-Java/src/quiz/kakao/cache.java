package quiz.kakao;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class cache {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner scan = new Scanner(System.in);
        int cacheSize = scan.nextInt();
        //nextInt�Ŀ� ���� ������ ��������, scan.nextLine()���� Ŀ���� ���� �ٷ� �ðܾ� �Ѵ�.
        scan.nextLine();
        String input = scan.nextLine(); //���õ� �Է¹ޱ�
        scan.close();
        
        //�Է¹��� ���õ��� ��Ģ��� �߶� cities[] �迭�� ä�� �ִ� �ڵ��  
        StringTokenizer st = new StringTokenizer(input, ", ");
        String[] cities = new String[st.countTokens()];
        
        int tempI = 0;
        while(st.hasMoreTokens()) {
            String temp = st.nextToken();
            temp = temp.substring(1, temp.length()-1); //�� ���� ""�� �ڸ���
            temp = temp.toLowerCase(); //�ڸ� ���ڿ��� �ҹ��ڷ� �ٲ��ش�.
            cities[tempI] = temp;
            tempI++;
        }
        
        //LRUĳ�� ����
        LRUCache cache = new LRUCache(cacheSize);
        int time = 0;
        
        //ĳ�� ����� 0�϶�, hit�� �߻����� �����Ƿ� �ð��� ������ 5�ʾ� �����Ѵ�
        if(cacheSize == 0) {
            for(int i =0; i < cities.length; i++) {
                time +=5;
            }
        //ĳ�� ����� 0�� �ƴ�, �Ϲ����� ��쿡�� ������ ����.
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
        
        //�ʱ�ȭ
        int capacity;
        LinkedList<String> cityCached = new LinkedList<String>();
        public LRUCache(int capacity) {
            this.capacity = capacity;
        }
        
        public String set(String city) {
            //ĳ�� �ȿ� ã�� ���ð� ������
            if(cityCached.contains(city)) {
                cityCached.remove(city);
                cityCached.addFirst(city);
                return "hit";
            }else {
                // ĳ�� �ȿ� ã�� ���ð� ������, ĳ�ð� ���� ���� ��
                if(cityCached.size() <= capacity) {
                    cityCached.addFirst(city);
                    return "missed";
                    // ĳ�� �ȿ� ã�� ���ð� ����, ĳ�õ� �� á�� ��
                } else {
                    cityCached.removeLast();
                    cityCached.addFirst(city);
                    return "missed";
                }
            }
        }
    }   
}
