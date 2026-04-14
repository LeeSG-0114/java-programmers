package programmers.level1;

public class P12932 {
    public int[] solution(long n) {
        int lengthN = Long.toString(n).length();
        int[] answer = new int[lengthN];
        int y = 0;

        while (true) {
            answer[y] = (int) (n % 10);

            if (n < 10) {
                break;
            }

            n = n / 10;
            y++;
        }

        return answer;
    }
}
