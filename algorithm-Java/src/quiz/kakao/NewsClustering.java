package quiz.kakao;

import java.util.ArrayList;

public class NewsClustering {
    public static void main(String[] args) {
        String str1 = "FRANCE";
        String str2 = "french";
        System.out.println(solution(str1, str2));
    }
    
    public static int solution(String str1, String str2) {
        ArrayList<String> str1List = new ArrayList<>();
        ArrayList<String> str2List = new ArrayList<>();
        ArrayList<String> conList = new ArrayList<>();
        ArrayList<String> sumList = new ArrayList<>();
        
        String tempStr = "";
        for(int i = 0; i < str1.length()-1; i++) {
            tempStr = str1.substring(i, i+2).toLowerCase();
            if(tempStr.matches("^[a-z]+$")) {
                str1List.add(tempStr);
            }
        }
        
        for(int i = 0; i < str2.length()-1; i++) {
            tempStr = str2.substring(i, i+2).toLowerCase();
            if(tempStr.matches("^[a-z]+$")) {
                str2List.add(tempStr);
            }
        }
        
        boolean emptyLists = false;
        
        if(str1List.size() == 0 & str2List.size() == 0) {
            emptyLists = true;
        }
        
        //교집합 만들기
        for(int i = 0; i < str1List.size(); i++) {
            for(int j = 0; j < str2List.size(); j++) {
                if(str1List.get(i).equals(str2List.get(j))) {
                    conList.add(str2List.get(j)); // str1List와 str2List에서 겹치는 문자열은 conList에 전부 저장
                    str1List.remove(i); //str1List에서 겹치는 문자열 삭제
                    str2List.remove(j); //str2List에서 겹치는 문자열 삭제
                    i--;
                    j = -1;
                    break;
                }
            }
        }
        
        //합집합(sumList) 만들기 
        sumList.addAll(str1List); //교집합 문자열이 삭제되있는 str1List
        sumList.addAll(str2List); //교집합 문자열이 삭제되있는 str2List
        sumList.addAll(conList); //교집합 문자열
        
        float zacquard;
        if(emptyLists == false) { 
            float con = (float) conList.size();
            float sum = (float) sumList.size();
            zacquard = (con / sum) * 65536;
        } else { //str1List와 str2List가 전부 비어있을 경우
            zacquard = 65536;
        }
        
        int result = (int) zacquard;
        return result;
    }
}
