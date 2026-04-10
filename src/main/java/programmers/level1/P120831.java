package programmers.level1;

public class P120831 {
    public int solution(int n) {
        int answer = 0;

        boolean limitCheck = (0 < n && 1000 >= n);

        if (limitCheck) {
            for (int i = 2; i <= n; i += 2) {
                answer += i;
            }
        }

        return answer;
    }
}
