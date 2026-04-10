package programmers.level1;

public class P120829 {
    public int solution(int angle) {
        int answer = 0;

        boolean limitCheck = (0 < angle && 180 >= angle);

        if (limitCheck) {
            if (angle == 90) {
                answer = 2;
            } else if (angle == 180) {
                answer = 4;
            } else if (90 > angle) {
                answer = 1;
            } else {
                answer = 3;
            }
        }
        return answer;
    }
}
