import java.util.Arrays;
class SteppingStone_Crossing {
    public int solution(int distance, int[] rocks, int n) {
        int answer = 0;
        Arrays.sort(rocks); //�̺�Ž���� ������������ ���ĵǾ��ִ� ��츦 ������ ��.

        int start = 0, end = distance;
        while(start < end) {
            int mid = (start + end + 1) / 2;
            int remove = 0, temp = 0;
            for(int i = 0; i < rocks.length; i++) {
                if(rocks[i] - temp < mid) { //mid���� ���� ���� �����Ѵٸ� 
                    remove++; //������
                }else { //mid���� ũ�ų� �������� �����Ѵٸ�
                    temp = rocks[i]; //���� rocks������ �ʱ�ȭ
                } 
            }
            if(remove > n) {
                end = mid - 1;
            }else {
                start = mid;
            }
        }
        return answer = start;
    }
}
