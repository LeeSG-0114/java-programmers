package programmers.level1;

public class P120817 {
    public double solution(int[] numbers) {
        double sum = 0;

        for(int num : numbers) {
            sum += num;
        }

        return sum / numbers.length;
    }
}
