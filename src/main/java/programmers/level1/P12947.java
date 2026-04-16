package programmers.level1;

public class P12947 {
    public boolean solution(int x) {
        boolean answer = true;
        int length = Integer.toString(x).length();
        int originX = x;
        int sum = 0;

        for (int i = 0; i < length; i++) {
            sum += (x % 10);
            x /= 10;
        }

        return originX % sum == 0;

    }
}
