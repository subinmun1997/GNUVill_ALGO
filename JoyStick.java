import java.util.ArrayList;
class Solution {
    public int solution(String name) {
        int[] js = new int[name.length()];
        ArrayList<Integer> chk = new ArrayList<>();
        int answer, pointer, start, end;
        answer = pointer = 0;

        for(int i = 0; i < js.length; i++) {
            js[i] = (int) name.charAt(i) - 65; //아스키코드 int 변환
            if(js[i] != 0 && i != 0) chk.add(i);
        }

        //0번째 미리 처리. 3항 연산자
        if(js[pointer] != 0) answer += js[pointer] > 26 - js[pointer] ? 26 - js[pointer] : js[pointer];

        //리스트를 기준으로 while문 실행
        while(!chk.isEmpty()) {
            start = chk.get(0);
            end = chk.get(chk.size() - 1);

            //pointer가 가장 왼쪽에 있는 경우
            if(pointer < start) {
                if(start - pointer <= js.length - end + pointer) {
                    answer += start - pointer;
                    pointer = start;
                    chk.remove(new Integer(start)); //List 특정 요소 제거. int값만 넣을 경우 int번째 인수 삭제
                }
                else {
                    answer += js.length - end + pointer;
                    pointer = end;
                    chk.remove(new Integer(end));
                }
            }

            //pointer가 가장 오른쪽에 있는 경우. 가장자리부터 접근하기 때문에 중간에 있을 경우는 생략
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

            //알파벳 변화 계산
            if(js[pointer] != 0) answer += js[pointer] > 26 - js[pointer] ? 26 - js[pointer] : js[pointer];
        }
        return answer;
    }
}
