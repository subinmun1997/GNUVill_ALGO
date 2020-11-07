import java.util.Arrays;
class SteppingStone_Crossing {
    public int solution(int distance, int[] rocks, int n) {
        int answer = 0;
        Arrays.sort(rocks); //이분탐색은 오름차순으로 정렬되어있는 경우를 전제로 함.

        int start = 0, end = distance;
        while(start < end) {
            int mid = (start + end + 1) / 2;
            int remove = 0, temp = 0;
            for(int i = 0; i < rocks.length; i++) {
                if(rocks[i] - temp < mid) { //mid보다 작은 값이 존재한다면 
                    remove++; //제거함
                }else { //mid보다 크거나 같은값이 존재한다면
                    temp = rocks[i]; //현재 rocks값으로 초기화
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
