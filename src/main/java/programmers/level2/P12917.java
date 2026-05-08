package programmers.level2;

public class P12917 {
    public String solution(String s) {
        String[] sol = s.split("");
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < i; j++) {
                if (sol[j].compareTo(sol[i]) < 0) {
                    String temp = sol[i];
                    sol[i] = sol[j];
                    sol[j] = temp;
                }
            }
        }
        return String.join("", sol);
    }
}
