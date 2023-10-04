package DesignHashMap;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyHashMapTests {

    private MyHashMap hashMap;

    @Before
    public void setUp() {
        hashMap = new MyHashMap();
    }

    @Test
    public void testPutAndGet() {
        hashMap.put(1, 1);
        hashMap.put(2, 2);

        assertEquals(1, hashMap.get(1));
        assertEquals(2, hashMap.get(2));
        assertEquals(-1, hashMap.get(3));
    }

    @Test
    public void testUpdateExistingValue() {
        hashMap.put(1, 1);
        hashMap.put(2, 2);
        hashMap.put(2, 1);

        assertEquals(1, hashMap.get(2));
    }

    @Test
    public void testRemove() {
        hashMap.put(1, 1);
        hashMap.remove(1);

        assertEquals(-1, hashMap.get(1));
    }

    @Test
    public void testRemoveNonExistentKey() {
        hashMap.put(1, 1);
        hashMap.remove(2);

        assertEquals(1, hashMap.get(1));
    }

    @Test
    public void testEmptyHashMap() {
        assertEquals(-1, hashMap.get(1));
    }
}
