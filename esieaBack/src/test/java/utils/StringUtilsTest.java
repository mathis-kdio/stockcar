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
    public void nbOccurrence_with_4_a_return_4() {
        assertEquals(StringUtils.nbOccurrence("aaaa", 'a'), 4);
    }

    @Test
    public void nbOccurrence_with_4_a_return_0() {
        assertEquals(StringUtils.nbOccurrence("aaaa", 'b'), 0);
    }

    @Test
    public void nbOccurrence_with_null() {
        assertEquals(StringUtils.nbOccurrence(null, 'a'), 0);
    }
    
}

