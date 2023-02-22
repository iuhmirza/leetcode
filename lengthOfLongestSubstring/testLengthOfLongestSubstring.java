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

    @Test
    public void sanityAlternatingChar() {
        assertEquals(3, lengthOfLongestSubstring.lengthOfLongestSubstring("dvdf"));
    }

    @Test
    public void alternatingChar() {
        assertEquals(3, lengthOfLongestSubstring.lengthOfLongestSubstring("ddvdff"));
    }

    @Test
    public void increasingThenAlternatingChar() {
        assertEquals(5, lengthOfLongestSubstring.lengthOfLongestSubstring("abcdvdff"));
    }
}
