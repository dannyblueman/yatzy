package no.kristiania.yatzy;

public class Yatzygame {
    public int score(YatzyCategory category, int[] dice) {
        int result = 0;
        for (int die : dice) {
            if(die == 1){
                result += 1;
            }
        }

        return result;
    }
}
