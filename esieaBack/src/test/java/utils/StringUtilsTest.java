package utils;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringUtilsTest {
    
    @Test
    public void estEntier_with_null() {
        assertFalse(StringUtils.estEntier(null));
    }

    @Test
    public void estEntier_with_number() {
        assertTrue(StringUtils.estEntier("0"));
    }

    @Test
    public void estEntier_with_letter() {
        assertFalse(StringUtils.estEntier("a"));
    }

    @Test
    public void nbOccurrence_with_4_a_search_a() {
        assertEquals(StringUtils.nbOccurrence("aaaa", 'a'), 4);
    }

    @Test
    public void nbOccurrence_with_4_a_search_b() {
        assertEquals(StringUtils.nbOccurrence("aaaa", 'b'), 0);
    }

    @Test
    public void nbOccurrence_with_null() {
        assertEquals(StringUtils.nbOccurrence(null, 'a'), 0);
    }

    @Test
    public void nbOccurrence_with_4_AAAA_search_a() {
        assertEquals(StringUtils.nbOccurrence("AAAA", 'a'), 0);
    }

    @Test
    public void nbOccurrence_with_4_a_search_coma() {
        assertEquals(StringUtils.nbOccurrence("aaaa", ','), 0);
    }

    @Test
    public void nbOccurrence_with_4_a_search_4() {
        assertEquals(StringUtils.nbOccurrence("aaaa", '4'), 0);
    }

    @Test
    public void nbOccurrence_with_4_coma_search_coma() {
        assertEquals(StringUtils.nbOccurrence(",,,,", ','), 4);
    }

    @Test
    public void nbOccurrence_with_4_4_search_4() {
        assertEquals(StringUtils.nbOccurrence("4444", '4'), 4);
    }

    @Test
    public void nbOccurrence_with_4_A_search_A() {
        assertEquals(StringUtils.nbOccurrence("AAAA", 'A'), 4);
    }

    @Test
    public void nbOccurrence_with_11_4_search_4() {
        assertEquals(StringUtils.nbOccurrence("44444444444", '4'), 11);
    }

    @Test
    public void nbOccurrence_with_nothing_search_a() {
        assertEquals(StringUtils.nbOccurrence("", 'a'), 0);
    }
    
}

