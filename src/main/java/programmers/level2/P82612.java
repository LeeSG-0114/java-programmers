package programmers.level2;

public class P82612 {
    public long solution(int price, int money, int count) {

        long totalPrice = (long) price * ((long) count * (count + 1) / 2);

        if (money < totalPrice) {
            return totalPrice - money;
        }

        return 0;

    }
}
