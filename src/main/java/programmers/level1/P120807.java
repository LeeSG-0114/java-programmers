package programmers.level1;

public class P120807 {
    public int solution(int num1, int num2) {
        int answer = 0;

        boolean limitCheck = ((0 <= num1 && 10000 >= num1) && (0 <= num2 && 10000 >= num2));

        if (limitCheck) {
            answer = (num1 == num2) ? 1 : -1;
        }

        return answer;
    }
}
