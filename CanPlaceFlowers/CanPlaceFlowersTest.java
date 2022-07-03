package CanPlaceFlowers;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CanPlaceFlowersTest {
    CanPlaceFlowers canPlaceFlowersObj = new CanPlaceFlowers();

    @Test
    public void testCanPlaceFlowers1() {
        int[] flowerbed = new int[] { 1, 0, 0, 0, 1 };
        int n = 1;
        assertTrue(canPlaceFlowersObj.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void testCanPlaceFlowers2() {
        int[] flowerbed = new int[] { 1, 0, 0, 0, 1 };
        int n = 2;
        assertFalse(canPlaceFlowersObj.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void testCanPlaceFlowers3() {
        int[] flowerbed = new int[] { 1, 0, 1, 0, 0, 1, 0 };
        int n = 1;
        assertFalse(canPlaceFlowersObj.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void testCanPlaceFlowers4() {
        int[] flowerbed = new int[] { 1, 0, 0, 0, 1 };
        int n = 1;
        assertTrue(canPlaceFlowersObj.canPlaceFlowers(flowerbed, n));
    }

}
