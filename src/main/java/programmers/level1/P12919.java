package programmers.level1;

public class P12919 {
    public String solution(String[] seoul) {
        String answer = "";
        int i = 0;

        for (String name : seoul) {
            if (name.equals("Kim")) {
                answer = "김서방은 " + i + "에 있다";
                break;
            }
            i++;
        }
        return answer;
    }
}
