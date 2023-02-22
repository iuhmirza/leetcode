package lengthOfLongestSubstring;

import org.junit.Test;
import static org.junit.Assert.*;
public class testLengthOfLongestSubstring {
    @Test
    public void sanityOneCharTest() {
        assertEquals(1, lengthOfLongestSubstring.lengthOfLongestSubstring("a"));
    }

    @Test
    public void sanityFiveCharTest() {
        assertEquals(5, lengthOfLongestSubstring.lengthOfLongestSubstring("abcde"));
    }

    @Test
    public void EightCharThreeLenTest() {
        assertEquals(3, lengthOfLongestSubstring.lengthOfLongestSubstring("ababcaba"));
    }

    @Test
    public void SaneCharTest() {
        assertEquals(1, lengthOfLongestSubstring.lengthOfLongestSubstring("aaaaaaaa"));
    }

    @Test
    public void emptyStringTest() {
        assertEquals(0, lengthOfLongestSubstring.lengthOfLongestSubstring(""));
    }
}
