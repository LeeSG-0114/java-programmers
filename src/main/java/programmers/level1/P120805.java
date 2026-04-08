package programmers.level1;

public class P120805 {
    public int solution(int num1, int num2) {

        int answer = 0;
        boolean limitCheck = ((0 <= num1 && 100 >= num1) && (0 <= num2 && 100 >= num2));

        if (limitCheck) {
            answer = num1 / num2;
        }
        return answer;
    }
}
