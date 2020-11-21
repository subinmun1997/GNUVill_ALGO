import java.util.Arrays;
class Burst_balloon {
    public int solution(int[] a) {


        if (a.length == 1) {
            return 1;
        }

        if (a.length == 2) {
            return 0;
        }
        int answer = 2;                     // ó���� �� ǳ���� �ᱹ ��Ƴ��� �� �����Ƿ�
        int minValue = Integer.MAX_VALUE;   // �ּڰ�
        int[] leftMin = new int[a.length];
        int[] rightMin = new int[a.length];

        for(int i = 0; i < a.length; i++) { // ���� �� ���� ���ϸ鼭 �� ū ���� leftMin �迭�� ����
            if(minValue > a[i]) {
                minValue = a[i];
            }
            leftMin[i] = minValue; 
        }

        minValue = Integer.MAX_VALUE;           //�ּڰ� �ʱ�ȭ

        for(int i = a.length-1; i >= 0; i--) { // ������ �� ���� ���ϸ鼭 �� ū ���� rightMin �迭�� ����
            if(minValue > a[i]) {
                minValue = a[i];
            }
            rightMin[i] = minValue; 
        }

        for(int i = 1; i < a.length-1; i++) { //a[i]�� ���� leftMin[i] < a[i] && rightMin[i] < a[i] ������ �����Ѵٸ� 1����
            if(leftMin[i] < a[i] && rightMin[i] < a[i]) {
                continue;
            }
            answer++;
        }

        return answer;
    }
}