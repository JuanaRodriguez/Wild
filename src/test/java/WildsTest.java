import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link SearchEngine}
 */

public class WildsTest {
    String haystack = "Once upon a midnight dreary, while I pondered, weak and weary";
    SearchEngine searchEngine = new SearchEngine();

    @Test
    public void normalSearchTest() {
        assertEquals(0, searchEngine.find("Once", haystack));
        assertEquals(12, searchEngine.find("midnight", haystack));
        assertEquals(-1, searchEngine.find("codewars", haystack));
    }

    @Test
    public void wildSearchTest() {
        assertEquals(5, searchEngine.find("_po_", haystack));
        assertEquals(12, searchEngine.find("___night", haystack));
    }
}
