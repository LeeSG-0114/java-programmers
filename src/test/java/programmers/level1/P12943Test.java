package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P12943Test {

    @Test
    void test1() {
        P12943 sol = new P12943();

        assertEquals(-1, sol.solution(626331));
    }

    @Test
    void test2() {
        P12943 sol = new P12943();

        assertEquals(8, sol.solution(6));
    }

}
