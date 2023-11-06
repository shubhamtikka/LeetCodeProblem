package SeatReservationManager;

import org.junit.Test;
import static org.junit.Assert.*;

public class SeatManagerTests {

    @Test
    public void testExample() {
        SeatManager seatManager = new SeatManager(5);
        assertEquals(1, seatManager.reserve());
        assertEquals(2, seatManager.reserve());
        seatManager.unreserve(2);
        assertEquals(2, seatManager.reserve());
        assertEquals(3, seatManager.reserve());
        assertEquals(4, seatManager.reserve());
        assertEquals(5, seatManager.reserve());
        seatManager.unreserve(5);

    }

    @Test
    public void testReserveUnreserve() {
        SeatManager seatManager = new SeatManager(10);
        assertEquals(1, seatManager.reserve());
        assertEquals(2, seatManager.reserve());
        seatManager.unreserve(2);
        assertEquals(2, seatManager.reserve());
        assertEquals(3, seatManager.reserve());
        assertEquals(4, seatManager.reserve());
        seatManager.unreserve(4);
        seatManager.unreserve(1);
        assertEquals(1, seatManager.reserve());
        assertEquals(4, seatManager.reserve());
    }

    @Test
    public void testMaxCapacity() {
        SeatManager seatManager = new SeatManager(100000);
        for (int i = 1; i <= 100000; i++) {
            assertEquals(i, seatManager.reserve());
        }
        assertNull(seatManager.reserve());
    }
}
