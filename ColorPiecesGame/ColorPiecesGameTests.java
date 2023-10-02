package ColorPiecesGame;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ColorPiecesGameTests {

    @Test
    public void testExample1() {
        ColorPiecesGame game = new ColorPiecesGame();
        String colors = "AAABABB";
        boolean expected = true;
        boolean result = game.winnerOfGame(colors);
        assertEquals(expected, result);
    }

    @Test
    public void testExample2() {
        ColorPiecesGame game = new ColorPiecesGame();
        String colors = "AA";
        boolean expected = false;
        boolean result = game.winnerOfGame(colors);
        assertEquals(expected, result);
    }

    @Test
    public void testExample3() {
        ColorPiecesGame game = new ColorPiecesGame();
        String colors = "ABBBBBBBAAA";
        boolean expected = false;
        boolean result = game.winnerOfGame(colors);
        assertEquals(expected, result);
    }
}
