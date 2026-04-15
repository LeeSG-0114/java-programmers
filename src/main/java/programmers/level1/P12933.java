package programmers.level1;

public class P12933 {
    public long solution(long n) {
        int length = String.valueOf(n).length();
        long[] num = new long[length];
        long answer = 0;

        for(int i = 0; i < length; i++) {
            num[i] = n%10;
            n /= 10;
        }

        for(int i = 0; i < num.length ; i++) {
            for(int j = 0 ; j < i ; j++) {
                if(num[j] < num[i]) {
                    long x = num[j];
                    num[j] = num[i];
                    num[i] = x;
                }
            }
        }

        for (long i : num) {
            answer = (answer * 10) + i;
        }

        return answer;
    }

}
