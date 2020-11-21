import java.util.Arrays;
class Burst_balloon {
    public int solution(int[] a) {


        if (a.length == 1) {
            return 1;
        }

        if (a.length == 2) {
            return 0;
        }
        int answer = 2;                     // 처음과 끝 풍선은 결국 살아남을 수 있으므로
        int minValue = Integer.MAX_VALUE;   // 최솟값
        int[] leftMin = new int[a.length];
        int[] rightMin = new int[a.length];

        for(int i = 0; i < a.length; i++) { // 왼쪽 값 부터 비교하면서 더 큰 값을 leftMin 배열에 넣음
            if(minValue > a[i]) {
                minValue = a[i];
            }
            leftMin[i] = minValue; 
        }

        minValue = Integer.MAX_VALUE;           //최솟값 초기화

        for(int i = a.length-1; i >= 0; i--) { // 오른쪽 값 부터 비교하면서 더 큰 값을 rightMin 배열에 넣음
            if(minValue > a[i]) {
                minValue = a[i];
            }
            rightMin[i] = minValue; 
        }

        for(int i = 1; i < a.length-1; i++) { //a[i]의 값이 leftMin[i] < a[i] && rightMin[i] < a[i] 조건을 만족한다면 1증가
            if(leftMin[i] < a[i] && rightMin[i] < a[i]) {
                continue;
            }
            answer++;
        }

        return answer;
    }
}