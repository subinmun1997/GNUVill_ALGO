import java.util.ArrayList;
class Solution {
    public int solution(String name) {
        int[] js = new int[name.length()];
        ArrayList<Integer> chk = new ArrayList<>();
        int answer, pointer, start, end;
        answer = pointer = 0;

        for(int i = 0; i < js.length; i++) {
            js[i] = (int) name.charAt(i) - 65; //�ƽ�Ű�ڵ� int ��ȯ
            if(js[i] != 0 && i != 0) chk.add(i);
        }

        //0��° �̸� ó��. 3�� ������
        if(js[pointer] != 0) answer += js[pointer] > 26 - js[pointer] ? 26 - js[pointer] : js[pointer];

        //����Ʈ�� �������� while�� ����
        while(!chk.isEmpty()) {
            start = chk.get(0);
            end = chk.get(chk.size() - 1);

            //pointer�� ���� ���ʿ� �ִ� ���
            if(pointer < start) {
                if(start - pointer <= js.length - end + pointer) {
                    answer += start - pointer;
                    pointer = start;
                    chk.remove(new Integer(start)); //List Ư�� ��� ����. int���� ���� ��� int��° �μ� ����
                }
                else {
                    answer += js.length - end + pointer;
                    pointer = end;
                    chk.remove(new Integer(end));
                }
            }

            //pointer�� ���� �����ʿ� �ִ� ���. �����ڸ����� �����ϱ� ������ �߰��� ���� ���� ����
            else {
                if(js.length - pointer + start < pointer - end) {
                    answer += js.length - start + pointer;
                    pointer = start;
                    chk.remove(new Integer(start));
                }
                else {
                    answer += pointer - end;
                    pointer = end;
                    chk.remove(new Integer(end));
                }
            }

            //���ĺ� ��ȭ ���
            if(js[pointer] != 0) answer += js[pointer] > 26 - js[pointer] ? 26 - js[pointer] : js[pointer];
        }
        return answer;
    }
}
