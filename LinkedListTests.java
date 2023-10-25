import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;

public class LinkedListTests {

    @Test
    public void testPrepend() {
        LinkedList input = new LinkedList();
        input.prepend(1);
        input.prepend(2);
        input.prepend(3);
        String expected = "3 2 1 ";

        assertEquals(expected, input.toString());
    }
    @Test
    public void testAppend() {
        LinkedList input = new LinkedList();
        input.append(1);
        input.append(2);
        input.append(3);
        String expected = "1 2 3 ";

        assertEquals(expected, input.toString());
    }

    public void testLength() {
        LinkedList input = new LinkedList();
        input.prepend(1);
        input.prepend(2);
        input.prepend(3);
        int expected = 3;

        assertEquals(expected, input.length());
    }

}
