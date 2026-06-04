package programmers.level2;

public class P12930 {
    public String solution(String s) {

        String[] sentence = s.split(" ",-1);

        for(int i = 0; i < sentence.length; i++) {
            char[] sol = sentence[i].toCharArray();
            for(int j = 0; j < sentence[i].length(); j++) {
                if(j%2==0) {
                    sol[j] = Character.toUpperCase(sol[j]);
                } else {
                    sol[j] = Character.toLowerCase(sol[j]);
                }
            }
            sentence[i] = new String(sol);
        }
        return String.join(" ", sentence);
    }
}
