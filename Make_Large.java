class Make_Large {
    public String solution(String number, int k) {
        int bigNumLen = number.length() - k;
        char[] chNumber = number.toCharArray();
        StringBuilder answer = new StringBuilder();

        int maxIndex = 0;
        int endIndex = k + 1;

        for (int i = 0; i < bigNumLen; i++) {
            char max = '0';
            for (int j = maxIndex; j < endIndex; j++) {
                char temp = chNumber[j];
                if (max < temp) {
                    max = temp;
                    maxIndex = j;
                }
            }

            answer.append(max);
            maxIndex++;
            endIndex++;

            if (maxIndex == endIndex) {
                answer.append(number.substring(maxIndex, number.length() - maxIndex));
                break;
            }
        }

        return answer.toString();
    }
}