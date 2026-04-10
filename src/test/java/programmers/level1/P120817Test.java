package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P120817Test {

    @Test
    void test1() {
        P120817 sol = new P120817();
        int[] x = {1,2,3};
        assertEquals(2.0, sol.solution(x));
    }

}
