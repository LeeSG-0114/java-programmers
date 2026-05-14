package programmers.level2;

public class P68935 {
    public int solution(int n) {
        int answer = 0;
        int power = 1;
        int size = 0;
        int[] num = new int[20];

        for(int i = 0 ; n > 0 ; i++) {
            num[i] = n % 3;
            n /= 3;
            size++;
        }

        for(int i = 1 ; i <= size ; i++) {
            answer += num[size-i] * power;
            power *= 3;
        }

        return answer;
    }
}
