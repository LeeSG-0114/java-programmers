package programmers.level2;

public class P12940 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int a = n;
        int b = m;

        while (a != 0) {
            int temp;
            temp = a;
            a = b % a;
            b = temp;
        }

        answer[0] = b;
        answer[1] = n * m / b;

        return answer;
    }
}
