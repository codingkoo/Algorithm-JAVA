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
        
        //������ �����
        for(int i = 0; i < str1List.size(); i++) {
            for(int j = 0; j < str2List.size(); j++) {
                if(str1List.get(i).equals(str2List.get(j))) {
                    conList.add(str2List.get(j)); // str1List�� str2List���� ��ġ�� ���ڿ��� conList�� ���� ����
                    str1List.remove(i); //str1List���� ��ġ�� ���ڿ� ����
                    str2List.remove(j); //str2List���� ��ġ�� ���ڿ� ����
                    i--;
                    j = -1;
                    break;
                }
            }
        }
        
        //������(sumList) ����� 
        sumList.addAll(str1List); //������ ���ڿ��� �������ִ� str1List
        sumList.addAll(str2List); //������ ���ڿ��� �������ִ� str2List
        sumList.addAll(conList); //������ ���ڿ�
        
        float zacquard;
        if(emptyLists == false) { 
            float con = (float) conList.size();
            float sum = (float) sumList.size();
            zacquard = (con / sum) * 65536;
        } else { //str1List�� str2List�� ���� ������� ���
            zacquard = 65536;
        }
        
        int result = (int) zacquard;
        return result;
    }
}
