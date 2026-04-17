package programmers.level1;

public class P12912 {
    public long solution(int a, int b) {
        long answer = 0;
        int highNum;
        int lowNum;

        if (a < b) {
            lowNum = a;
            highNum = b;
        } else {
            lowNum = b;
            highNum = a;
        }

        for (int i = 0; i <= (highNum - lowNum); i++) {
            answer += (lowNum + i);
        }

        return answer;
    }
}
