package StackUsingQueues;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class StackUsingQueuesTest {

    private StackUsingQueues stack;

    @Before
    public void setUp() {
        stack = new StackUsingQueues();
    }

    @Test
    public void testPushAndPop() {

        assertTrue(stack.empty());

        stack.push(10);
        stack.push(20);
        stack.push(30);
        assertEquals(30, stack.top());

        assertFalse(stack.empty());

        assertEquals(30, stack.pop());
        assertEquals(20, stack.pop());
        assertEquals(10, stack.pop());

        assertTrue(stack.empty());

    }

}
