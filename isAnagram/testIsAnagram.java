package isAnagram;

import org.junit.Test;
import static org.junit.Assert.*;
public class testIsAnagram {

    @Test
    public void sanityZeroCharTrue() {
        assertTrue(Solution.isAnagram("", ""));
    }

    @Test
    public void sanityOneCharTrue() {
        assertTrue(Solution.isAnagram("a", "a"));
    }

    @Test
    public void sanityOneCharFalse() {
        assertFalse(Solution.isAnagram("a", "b"));
    }

    @Test
    public void severalCharTrue() {
        assertTrue(Solution.isAnagram("acbdfe", "abcdef"));
    }


    @Test
    public void uniqueDifferentChar() {
        assertFalse(Solution.isAnagram("acbdfe", "acbgfe"));
    }

    @Test
    public void sameDifferentChar() {
        assertFalse(Solution.isAnagram("acbdfe", "acbdde"));
    }

    @Test
    public void differentLengthSameChar() {
        assertFalse(Solution.isAnagram("abcdef", "bacde"));
    }

    @Test
    public void differentLengthUniqueChar() {
        assertFalse(Solution.isAnagram("abcde", "bacdef"));
    }

    @Test
    public void lengthy() {
        assertTrue(Solution.isAnagram("abcdefghijklmnopqrstuvwxyz", "qwertyuiopasdfghjklzxcvbnm"));
    }
}
