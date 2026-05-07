package programmers.level2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P77884Test {

    @Test
    void test1() {
        P77884 sol = new P77884();
        assertEquals(43, sol.solution(13, 17));
    }

}
