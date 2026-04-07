package programmers.level1;

public class P120803 {

  public int solution(int num1, int num2) {
    int answer = 0;
    boolean limitCheck = (-50000<=num1 && 50000>=num1 && -50000<=num2 && 50000>=num2);

    if(limitCheck) {
      answer = num1 - num2;
    }

    return answer;

  }
}
