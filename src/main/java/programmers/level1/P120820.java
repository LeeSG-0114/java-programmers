package programmers.level1;

public class P120820 {
    public int solution(int age) {
        int answer = 0;
        int targetYear = 2022;
        boolean limitCheck = (0 < age && 120 >= age);


        if (limitCheck) {
            answer = targetYear - age + 1;
        }

        return answer;
    }
}
