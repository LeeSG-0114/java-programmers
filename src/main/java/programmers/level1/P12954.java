package programmers.level1;

public class P12954 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for (int y = 1; y <= n; y++) {
            answer[y - 1] = (long) x * y;
        }
        return answer;
    }
}
