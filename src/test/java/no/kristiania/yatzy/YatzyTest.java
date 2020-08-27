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
        assertEquals(4, yatzygame.score(YatzyCategory.TWOS, new int[] {1, 1, 2, 1, 1,}));
        assertEquals(2, yatzygame.score(YatzyCategory.TWOS, new int[] {6, 5, 2, 1, 1,}));
    }
}
