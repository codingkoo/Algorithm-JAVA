package book.basic;

public class RecursiveSum {
    // ��� ȣ�� ���� : n���� k���� �� ���ϱ�
    public static void main(String[] args) {
        System.out.println(sum(1, 100));
        System.out.println(sum(3, 5));
    }
    
    public static int sum(int startN, int endN) {
        if(startN == endN)
            return endN;
        
        return startN + sum(startN+1, endN);
    }
}
