import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;

public class ListTests {
    @Test 
	public void testFilter() {
        List<String> input1 = new ArrayList<String>();
        input1.add("dogs");
        input1.add("sham cats");
        input1.add("abyssinian cats");
        StringChecker sc = new StringCheckCats();
        input1 = ListExamples.filter(input1, sc);
        List<String> expected = new ArrayList<String>();
        expected.add("sham cats");
        expected.add("abyssinian cats");
        assertEquals(expected, input1);
	}

    @Test
    public void testmerge() {
        List<String> input1 = new ArrayList<String>();
        input1.add("a");
        List<String> input2 = new ArrayList<String>();
        input2.add("b");
        List<String> input = new ArrayList<String>();
        input = ListExamples.merge(input1, input2);

        List<String> expected = new ArrayList<String>();
        expected.add("a");
        expected.add("b");

        assertEquals(expected, input);
    }
}
