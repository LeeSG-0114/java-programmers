package programmers.level2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P12930Test {

    @Test
    void test1() {
        P12930 sol = new P12930();
        assertEquals("TrY  HeLlO", sol.solution("try  hello"));
        assertEquals(" HeLlO", sol.solution(" hello"));
        assertEquals("HeLlO ", sol.solution("hello "));
        assertEquals("A", sol.solution("a"));
        assertEquals("TrY HeLlO WoRlD", sol.solution("try hello world"));
    }

}
