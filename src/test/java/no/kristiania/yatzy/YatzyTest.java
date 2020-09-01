package no.kristiania.yatzy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatzyTest {

    private Yatzygame yatzygame = new Yatzygame();

    @Test
    public void shouldScoreOnes(){
        assertEquals(4, yatzygame.score(YatzyCategory.ONES, new int[] {1, 1, 2, 1, 1,}));
        assertEquals(2, yatzygame.score(YatzyCategory.ONES, new int[] {6, 5, 2, 1, 1,}));
    }
    @Test
    public void shouldScoreTwo(){
        assertEquals(2, yatzygame.score(YatzyCategory.TWOS, new int[] {1, 1, 2, 1, 1,}));
        assertEquals(4, yatzygame.score(YatzyCategory.TWOS, new int[] {6, 5, 2, 2, 1,}));
    }

    @Test
    void shouldScorePair(){
        assertEquals(10, yatzygame.score(YatzyCategory.PAIR, new int[] {1, 3, 5, 5, 2}));
    }
}
