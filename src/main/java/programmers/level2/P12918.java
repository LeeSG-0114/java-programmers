package programmers.level2;

public class P12918 {
    public boolean solution(String s) {

        if (!(s.length() == 6 || s.length() == 4)) {
            return false;
        }

        char[] sol = s.toCharArray();
        for (char i : sol) {
            if (i < 48 || i > 57) {
                return false;
            }
        }

        return true;
    }
}
