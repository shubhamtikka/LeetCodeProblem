package PaintingTheWalls;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PaintingTheWallsTests {

    PaintingTheWalls paintingTheWalls = new PaintingTheWalls();

    @Test
    public void testPaintingTheWallsExample1() {
        int[] cost = { 1, 2, 3, 2 };
        int[] time = { 1, 2, 3, 2 };
        int expected = 3;
        int result = paintingTheWalls.paintWalls(cost, time);
        assertEquals(expected, result);
    }

    @Test
    public void testPaintingTheWallsExample2() {
        int[] cost = { 2, 3, 4, 2 };
        int[] time = { 1, 1, 1, 1 };
        int expected = 4;
        int result = paintingTheWalls.paintWalls(cost, time);
        assertEquals(expected, result);
    }

    @Test
    public void testPaintingTheWallsCustom2() {
        int[] cost = { 2, 2, 2 };
        int[] time = { 1, 1, 1 };
        int expected = 4;
        int result = paintingTheWalls.paintWalls(cost, time);
        assertEquals(expected, result);
    }

}
