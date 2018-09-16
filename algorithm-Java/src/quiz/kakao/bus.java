package quiz.kakao;

import java.util.Arrays;

public class bus {

    public static void main(String[] args) {
        System.out.println(getLastTime(1, 1, 5, new String[]{"08:00", "08:01", "08:02", "08:03"}));
        System.out.println(getLastTime(2, 10, 2, new String[]{"09:10", "09:09", "08:00"}));
        System.out.println(getLastTime(2, 1, 2, new String[]{"09:00", "09:00", "09:00", "09:00"}));
        System.out.println(getLastTime(1, 1, 5, new String[]{"00:01", "00:01", "00:01", "00:01", "00:01"}));
        System.out.println(getLastTime(1, 1, 1, new String[]{"23:59"}));
        System.out.println(getLastTime(10, 60, 45, new String[]{"23:59","23:59", "23:59", "23:59", "23:59", "23:59"
                , "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59"}));
    }
    
    /**
     * ���������� Ż �� �ִ� ���� �ð� ����
     * @param n ���� �������� Ƚ��
     * @param t �������� ����
     * @param m �ѹ��� �¿� �� �ִ� ��� ��
     * @param waitTime �ټ��� �ִ� �����
     * @return ���������� Ż �� �ִ� ���� �ð�
     */
    public static String getLastTime(int n, int t, int m, String[] waitTime) {
        String answer = "";
        
        // ���� �����ð� ���
        String[] busTime = new String[n];
        for(int i = 0; i < n ; i++) {
            busTime[i] = getAddTime("09:00", t*i);
        }
        
        String lastBustTime = busTime[n-1];
        
        //����� ����� ������ �������� ����
        Arrays.sort(waitTime);
        
        int curPos = 0;
        int curAdded = 0;
        String busStop = "";
        for(int j = 0; j < busTime.length; j++) {
            busStop = busTime[j];
            curAdded = 0;
            // ���������� ������ ������ for�� ó��
            for(int k = curPos ; curPos < waitTime.length; k++) {
                // ���� ������ �ð� ������ ������ ����� �ִ� ���  && ���� ������  �� �ڸ��� �ִ� ���
                if(getMinLong(busStop)>=getMinLong(waitTime[k]) && curAdded < m ) {
                    answer = waitTime[curPos]; // ������ ž�� ������ ��� ���� �ð� �Խ�����
                    answer = getAddTime(answer, -1); // ������ ž�� ������ ���� 1�� ���� ������ �ӽýð� ����
                    curPos++;
                    curAdded++;
                    // curAdd < m ���� �ڸ��� �����ְ�, ������ ž�°��̸� ���� ���� �ð��� �°� ����
                    if(j==busTime.length -1 && k == waitTime.length-1 && curAdded < m) {
                        answer = busTime[n-1];
                    }
                }
                else {
                    // ������ ���� �ε� ž�°��� ���� ��Ÿ�� ��� ����ž����(answer)���� ���� �;� ��
                    if(j==busTime.length-1 && curPos >= 1) {
                        // ������ ž�� ������ ��� ���� �ð� �Խ�����
                        answer = waitTime[curPos -1];
                        answer = getAddTime(answer, -1);    
                    }
                    break;
                }
            }
        }
        
        // ������ ������ Ÿ�� ������ �ִ� ���
        if("".equals(answer)||getMinLong(answer) > getMinLong(lastBustTime)) {
            answer = lastBustTime;
        }
        
        return answer;
    }
    
    /**
     * hh:mm�� String�� �Է¹޾� addMin��ŭ ���� �ð� ����
     * @param hhmm
     * @param addMin
     * @return hhmm�п� addMin�� �� �ջ��� �ð�
     */
    private static String getAddTime(String hhmm, int addMin) {
        long temp = getMinLong(hhmm);
        temp = temp + addMin;
        int hh = (int)temp/60;
        int mm = (int)temp%60;
        return String.format("%02d", hh)+":"+String.format("%02d", mm);
        
    }
    
    /**
     * hh:mm �� ��Ʈ���� �Է¹޾� long������ ������ ����
     * �Է� String 01:30, ��� long 90
     * @param hhmm
     * @return longŸ���� ��
     */
    private static long getMinLong(String hhmm) {
        String arr[] = hhmm.split(":");
        int hh = Integer.parseInt(arr[0]);
        int mm = Integer.parseInt(arr[1]);
        return hh*60+mm;
    }
}
