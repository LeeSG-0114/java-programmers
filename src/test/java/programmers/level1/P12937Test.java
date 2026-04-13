package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P12937Test {

    @Test
    void test1() {
        P12937 sol = new P12937();
        assertEquals("Even", sol.solution(4));
    }

    @Test
    void test2() {
        P12937 sol = new P12937();
        assertEquals("Odd", sol.solution(-5));
    }

}
